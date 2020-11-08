package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Produit;
import com.engine.fakau.springmongodb.service.dto.ProduitDTO;
import org.springframework.stereotype.Service;

@Service
public class ProduitMapper implements IMapper<ProduitDTO, Produit> {
    @Override
    public Produit toEntity(ProduitDTO produitDTO) {
        return null;
    }

    @Override
    public ProduitDTO toDto(Produit produit) {
        return null;
    }
}
