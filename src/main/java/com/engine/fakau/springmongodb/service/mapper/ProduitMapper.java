package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Produit;
import com.engine.fakau.springmongodb.service.dto.ProduitDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitMapper implements IMapper<ProduitDTO, Produit> {
    @Autowired
    private CategorieMapper categorieMapper;

    @Override
    public Produit toEntity(ProduitDTO produitDTO) {
        Produit produit= new Produit();
        produit.setId(produitDTO.getId());
        produit.setNom(produitDTO.getNom());
        produit.setDescription(produitDTO.getDescription());
        produit.setPrix(produitDTO.getPrix());
        produit.setCategorie(categorieMapper.toEntity(produitDTO.getCategorie()));
        return produit;
    }

    @Override
    public ProduitDTO toDto(Produit produit) {
        ProduitDTO produitDTO= new ProduitDTO();
        produitDTO.setId(produit.getId());
        produitDTO.setNom(produit.getNom());
        produitDTO.setDescription(produit.getDescription());
        produitDTO.setPrix(produit.getPrix());
        produitDTO.setCategorie(categorieMapper.toDto(produit.getCategorie()));
        return produitDTO;
    }
}
