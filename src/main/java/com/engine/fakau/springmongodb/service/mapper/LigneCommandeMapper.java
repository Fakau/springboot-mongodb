package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.LigneCommande;
import com.engine.fakau.springmongodb.service.dto.LigneCommandeDTO;
import org.springframework.stereotype.Service;

@Service
public class LigneCommandeMapper implements IMapper<LigneCommandeDTO, LigneCommande> {

    @Override
    public LigneCommande toEntity(LigneCommandeDTO ligneCommandeDTO) {
        return null;
    }

    @Override
    public LigneCommandeDTO toDto(LigneCommande ligneCommande) {
        return null;
    }
}
