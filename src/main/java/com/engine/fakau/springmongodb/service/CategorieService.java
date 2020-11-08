package com.engine.fakau.springmongodb.service;

import com.engine.fakau.springmongodb.service.dto.CategorieDTO;

import java.util.List;
import java.util.Optional;

public interface CategorieService {
    CategorieDTO save(CategorieDTO categorieDTO);
    List<CategorieDTO> findAll();
    Optional<CategorieDTO> findOneById(Long id);
    Optional<CategorieDTO> findOneByNom(String nom);
    void delete(Long id);
}
