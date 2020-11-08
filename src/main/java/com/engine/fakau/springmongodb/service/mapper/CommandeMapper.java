package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Commande;
import com.engine.fakau.springmongodb.domaine.LigneCommande;
import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CommandeMapper implements IMapper<CommandeDTO, Commande>{
    @Autowired
    private CommandeMapper commandeMapper;
    @Autowired
    private LigneCommandeMapper ligneCommandeMapper;

    @Override
    public Commande toEntity(CommandeDTO commandeDTO) {
        Commande commande=new Commande();
        commande.setId(commandeDTO.getId());
        commande.setPrix(commandeDTO.getPrix());
        commande.setQuantiteTotalProduit(commandeDTO.getQuantiteTotalProduit());
        commande.setLigneCommandes(
                commandeDTO.getLigneCommandes()
                        .stream()
                        .map(ligneCommandeMapper::toEntity)
                        .collect(Collectors.toList())
        );
        return commande;
    }

    @Override
    public CommandeDTO toDto(Commande commande) {
        CommandeDTO commandeDTO=new CommandeDTO();
        commandeDTO.setId(commande.getId());
        commandeDTO.setPrix(commande.getPrix());
        commandeDTO.setQuantiteTotalProduit(commande.getQuantiteTotalProduit());
        commandeDTO.setLigneCommandes(
                commande.getLigneCommandes()
                        .stream()
                        .map(ligneCommandeMapper::toDto)
                        .collect(Collectors.toList())
        );
        return commandeDTO;
    }
}
