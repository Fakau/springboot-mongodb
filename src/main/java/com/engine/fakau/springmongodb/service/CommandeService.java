package com.engine.fakau.springmongodb.service;
import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import java.util.List;
import java.util.Optional;

public interface CommandeService {
    CommandeDTO save(CommandeDTO commandeDTO);
    List<CommandeDTO> findAll();
    Optional<CommandeDTO> findOneById(Long id);
    void delete(Long id);
}
