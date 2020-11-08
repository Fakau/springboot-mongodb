package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Commande;
import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import org.springframework.stereotype.Service;

@Service
public class CommandeMapper implements IMapper<CommandeDTO, Commande>{
    @Override
    public Commande toEntity(CommandeDTO commandeDTO) {
        return null;
    }

    @Override
    public CommandeDTO toDto(Commande commande) {
        return null;
    }
}
