package com.engine.fakau.springmongodb.rest;

import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import com.engine.fakau.springmongodb.service.serviceImpl.CommandeServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/commandes")
public class CommandeResource {
    private final CommandeServiceImpl commandeService;

    public CommandeResource(CommandeServiceImpl commandeService) {
        this.commandeService = commandeService;
    }

    @PostMapping("")
    public CommandeDTO save(@Valid @RequestBody CommandeDTO commandeDTO){
        if(commandeDTO.getId() != null){
            throw new RuntimeException("Cannot save CommandeDTO with id <> null");
        }
        return commandeService.save(commandeDTO);
    }
    @PutMapping("")
    public CommandeDTO update(@Valid @RequestBody CommandeDTO commandeDTO){
        if(commandeDTO.getId() == null){
            throw new RuntimeException("Cannot update CommandeDTO with id == null");
        }
        return commandeService.save(commandeDTO);
    }
    @GetMapping("/{id}")
    public Optional<CommandeDTO> findById(@PathVariable Long id){
        return commandeService.findOneById(id);
    }
    @GetMapping("")
    public List<CommandeDTO> getAll(){
        return commandeService.findAll();
    }
}
