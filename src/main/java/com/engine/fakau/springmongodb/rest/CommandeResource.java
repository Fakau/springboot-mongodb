package com.engine.fakau.springmongodb.rest;

import com.engine.fakau.springmongodb.service.dto.CommandeDTO;
import com.engine.fakau.springmongodb.service.serviceImpl.CommandeServiceImpl;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<CommandeDTO> save(@Valid @RequestBody CommandeDTO commandeDTO){
        return ResponseEntity.ok(commandeService.save(commandeDTO));
    }
    @PutMapping("")
    public ResponseEntity<CommandeDTO> update(@Valid @RequestBody CommandeDTO commandeDTO){
        return ResponseEntity.ok(commandeService.save(commandeDTO));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<CommandeDTO>> findById(@PathVariable Long id){
        return ResponseEntity.ok(commandeService.findOneById(id));
    }
    @GetMapping("")
    public ResponseEntity<List<CommandeDTO>> getAll(){
        return ResponseEntity.ok(commandeService.findAll());
    }
}
