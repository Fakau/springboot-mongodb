package com.engine.fakau.springmongodb.service;
import com.engine.fakau.springmongodb.service.dto.ProduitDTO;

import java.util.List;
import java.util.Optional;

public interface ProduitService {
    ProduitDTO save(ProduitDTO produitDTO);
    List<ProduitDTO> findAll();
    List<ProduitDTO> search(String keyWord);
    Optional<ProduitDTO> findOneById(Long id);
    void delete(Long id);
}
