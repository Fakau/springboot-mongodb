package com.engine.fakau.springmongodb.service.serviceImpl;

import com.engine.fakau.springmongodb.repository.CommandeRepository;
import com.engine.fakau.springmongodb.repository.LigneCommandeRepository;
import com.engine.fakau.springmongodb.service.CommandeService;
import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import com.engine.fakau.springmongodb.service.mapper.CommandeMapper;
import com.engine.fakau.springmongodb.service.mapper.LigneCommandeMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommandeServiceImpl implements CommandeService {
    private final CommandeRepository commandeRepository;
    private final LigneCommandeRepository ligneCommandeRepository;
    private final CommandeMapper commandeMapper;
    private final LigneCommandeMapper ligneCommandeMapper;

    public CommandeServiceImpl(final CommandeRepository commandeRepository,
                               final LigneCommandeRepository ligneCommandeRepository,
                               final CommandeMapper commandeMapper,
                               final LigneCommandeMapper ligneCommandeMapper) {
        this.commandeRepository = commandeRepository;
        this.ligneCommandeRepository = ligneCommandeRepository;
        this.commandeMapper = commandeMapper;
        this.ligneCommandeMapper = ligneCommandeMapper;
    }

    @Override
    public CommandeDTO save(CommandeDTO commandeDTO) {

        return null;
    }

    @Override
    public List<CommandeDTO> findAll() {
        return null;
    }

    @Override
    public Optional<CommandeDTO> findOneById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }
}
