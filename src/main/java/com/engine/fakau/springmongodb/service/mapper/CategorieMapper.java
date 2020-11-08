package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Categorie;
import com.engine.fakau.springmongodb.service.dto.CategorieDTO;
import org.springframework.stereotype.Service;

@Service
public class CategorieMapper implements IMapper<CategorieDTO, Categorie> {
    @Override
    public Categorie toEntity(CategorieDTO categorieDTO) {
        Categorie categorie = new Categorie();
        categorie.setId(categorieDTO.getId());
        categorie.setNom(categorieDTO.getNom());
        return categorie;
    }

    @Override
    public CategorieDTO toDto(Categorie categorie) {
        CategorieDTO categorieDTO = new CategorieDTO();
        categorieDTO.setId(categorie.getId());
        categorieDTO.setNom(categorie.getNom());
        return categorieDTO;
    }
}
