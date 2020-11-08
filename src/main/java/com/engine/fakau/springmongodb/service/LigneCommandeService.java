package com.engine.fakau.springmongodb.service;
import com.engine.fakau.springmongodb.service.dto.LigneCommandeDTO;

import java.util.List;
import java.util.Optional;

public interface LigneCommandeService {
    LigneCommandeDTO save(LigneCommandeDTO ligneCommandeDTO);
    List<LigneCommandeDTO> findAll();
    Optional<LigneCommandeDTO> findOneById(Long id);
    void delete(Long id);
}
