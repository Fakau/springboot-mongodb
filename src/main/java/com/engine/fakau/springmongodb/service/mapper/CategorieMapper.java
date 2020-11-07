package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Categorie;
import com.engine.fakau.springmongodb.service.dto.CategorieDTO;

public class CategorieMapper implements IMapper<CategorieDTO, Categorie> {
    @Override
    public Categorie toEntity(CategorieDTO categorieDTO) {
        return null;
    }

    @Override
    public CategorieDTO toDto(Categorie categorie) {
        return null;
    }
}
