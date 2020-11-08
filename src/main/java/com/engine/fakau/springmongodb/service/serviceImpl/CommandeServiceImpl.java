package com.engine.fakau.springmongodb.service.serviceImpl;

import com.engine.fakau.springmongodb.repository.CommandeRepository;
import com.engine.fakau.springmongodb.service.CommandeService;
import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import com.engine.fakau.springmongodb.service.dto.LigneCommandeDTO;
import com.engine.fakau.springmongodb.service.dto.ProduitDTO;
import com.engine.fakau.springmongodb.service.mapper.CommandeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository commandeRepository;
    private final ProduitServiceImpl produitService;
    private final CommandeMapper commandeMapper;

    public CommandeServiceImpl(final CommandeRepository commandeRepository,
                               final ProduitServiceImpl produitService,
                               final CommandeMapper commandeMapper) {
        this.commandeRepository = commandeRepository;
        this.produitService = produitService;
        this.commandeMapper = commandeMapper;
    }

    @Override
    public CommandeDTO save(CommandeDTO commandeDTO) {
        if(commandeDTO.getLigneCommandes().size() == 0){
            throw new RuntimeException("Cannot save Commande without LigneCommande");
        }
        BigDecimal commandePrix = BigDecimal.ZERO;
        Integer quantite = 0;
        for(LigneCommandeDTO ligneCommandeDTO: commandeDTO.getLigneCommandes()){
            ProduitDTO p = produitService.findOneById(ligneCommandeDTO.getProduit().getId())
                    .orElseThrow(() -> new RuntimeException("Produit not fount"));
            if((p.getPrix().doubleValue() * ligneCommandeDTO.getQuantite()) != ligneCommandeDTO.getPrix().doubleValue()  ){
                throw new RuntimeException("LigneCommande prix non valid prix produit "
                        + p.getPrix() +" * Quantite "+ligneCommandeDTO.getQuantite()
                        + " <> "+ ligneCommandeDTO.getPrix());
            }
            if(!(p.getCategorie().getId().equals(ligneCommandeDTO.getProduit().getCategorie().getId()))
               || !(p.getCategorie().getNom().equals(ligneCommandeDTO.getProduit().getCategorie().getNom())) ){
                throw new RuntimeException("Categorie non valid");
            }
            commandePrix = commandePrix.add(ligneCommandeDTO.getPrix());
            quantite = quantite + ligneCommandeDTO.getQuantite();
        }
        if(commandePrix.doubleValue() != commandeDTO.getPrix().doubleValue()){
            throw new RuntimeException("commande prix non valid "
                        + "prix commande "+commandeDTO.getPrix()
                        + " <> " +commandePrix);
        }
        if(quantite  != commandeDTO.getQuantiteTotalProduit()){
            throw new RuntimeException("commande quantite non valid");
        }
        return commandeMapper.toDto(commandeRepository.save(commandeMapper.toEntity(commandeDTO)));
    }

    @Override
    public List<CommandeDTO> findAll() {
        return commandeRepository.findAll()
                .stream()
                .map(commandeMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<CommandeDTO> findOneById(Long id) {
        return commandeRepository.findById(id).map(commandeMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        commandeRepository.deleteById(id);
    }
}
