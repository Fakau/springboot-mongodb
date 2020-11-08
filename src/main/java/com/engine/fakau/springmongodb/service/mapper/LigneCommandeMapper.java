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
        ligneCommande.setPrix(ligneCommandeDTO.getPrix());
        ligneCommande.setProduit(produitMapper.toEntity(ligneCommandeDTO.getProduit()));
        ligneCommande.setQuantite(ligneCommandeDTO.getQuantite());
        return ligneCommande;
    }

    @Override
    public LigneCommandeDTO toDto(LigneCommande ligneCommande) {
        LigneCommandeDTO ligneCommandeDTO = new LigneCommandeDTO();
        ligneCommandeDTO.setPrix(ligneCommande.getPrix());
        ligneCommandeDTO.setProduit(produitMapper.toDto(ligneCommande.getProduit()));
        ligneCommandeDTO.setQuantite(ligneCommande.getQuantite());
        return ligneCommandeDTO;
    }
}
