package com.engine.fakau.springmongodb.service.mapper;

import com.engine.fakau.springmongodb.domaine.Commande;
import com.engine.fakau.springmongodb.service.dto.CommandeDTO;

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
