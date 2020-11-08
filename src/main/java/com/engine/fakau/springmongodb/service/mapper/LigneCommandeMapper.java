package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.LigneCommande;
import com.engine.fakau.springmongodb.service.dto.LigneCommandeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class LigneCommandeMapper implements IMapper<LigneCommandeDTO, LigneCommande> {
    @Autowired
    private ProduitMapper produitMapper;
    @Autowired
    private CommandeMapper commandeMapper;

    @Override
    public LigneCommande toEntity(LigneCommandeDTO ligneCommandeDTO) {
        LigneCommande ligneCommande = new LigneCommande();
        ligneCommande.setId(ligneCommandeDTO.getId());
        ligneCommande.setPrix(ligneCommandeDTO.getPrix());
        ligneCommande.setProduits(
                ligneCommandeDTO.getProduits().stream().map(produitMapper::toEntity).collect(Collectors.toList())
        );
        ligneCommande.setQuantite(ligneCommandeDTO.getQuantite());
        ligneCommande.setCommande(commandeMapper.toEntity(ligneCommandeDTO.getCommande()));
        return ligneCommande;
    }

    @Override
    public LigneCommandeDTO toDto(LigneCommande ligneCommande) {
        LigneCommandeDTO ligneCommandeDTO = new LigneCommandeDTO();
        ligneCommandeDTO.setId(ligneCommande.getId());
        ligneCommandeDTO.setPrix(ligneCommande.getPrix());
        ligneCommandeDTO.setProduits(
                ligneCommande.getProduits().stream().map(produitMapper::toDto).collect(Collectors.toList())
        );
        ligneCommandeDTO.setQuantite(ligneCommande.getQuantite());
        ligneCommandeDTO.setCommande(commandeMapper.toDto(ligneCommande.getCommande()));
        return ligneCommandeDTO;
    }
}
