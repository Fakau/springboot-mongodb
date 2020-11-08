package com.engine.fakau.springmongodb.rest;

import com.engine.fakau.springmongodb.service.dto.ProduitDTO;
import com.engine.fakau.springmongodb.service.serviceImpl.ProduitServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/produits")
public class ProduitResource {
    private final ProduitServiceImpl produitService;

    public ProduitResource(ProduitServiceImpl produitService) {
        this.produitService = produitService;
    }

    @PostMapping("")
    public ResponseEntity<ProduitDTO> save(@Valid @RequestBody ProduitDTO produitDTO){
        return ResponseEntity.ok(produitService.save(produitDTO));
    }
    @PutMapping("")
    public ResponseEntity<ProduitDTO> update(@Valid @RequestBody ProduitDTO produitDTO){
        return ResponseEntity.ok(produitService.save(produitDTO));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProduitDTO>> findById(@PathVariable Long id){
        return ResponseEntity.ok(produitService.findOneById(id));
    }
    @GetMapping("/search")
    public ResponseEntity<List<ProduitDTO>> search(@RequestParam String keyWord){
        if(StringUtils.isEmpty(keyWord)){
            throw new RuntimeException("keyWord cannot be null");
        }
        return ResponseEntity.ok(produitService.search(keyWord));
    }
    @GetMapping("")
    public ResponseEntity<List<ProduitDTO>> getAll(){
        return ResponseEntity.ok(produitService.findAll());
    }

}
