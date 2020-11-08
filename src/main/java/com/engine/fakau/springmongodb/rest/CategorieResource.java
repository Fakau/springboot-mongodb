package com.engine.fakau.springmongodb.rest;

import com.engine.fakau.springmongodb.service.dto.CategorieDTO;
import com.engine.fakau.springmongodb.service.serviceImpl.CategorieServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categories")
public class CategorieResource {
    private final CategorieServiceImpl categorieService;

    public CategorieResource(CategorieServiceImpl categorieService) {
        this.categorieService = categorieService;
    }
    @PostMapping("")
    public ResponseEntity<CategorieDTO>save(@Valid @RequestBody CategorieDTO categorieDTO){
        return ResponseEntity.ok(categorieService.save(categorieDTO));
    }
    @PutMapping("")
    public ResponseEntity<CategorieDTO> update(@Valid @RequestBody CategorieDTO categorieDTO){
        return ResponseEntity.ok(categorieService.save(categorieDTO));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<CategorieDTO>> findById(@PathVariable Long id){
        return ResponseEntity.ok(categorieService.findOneById(id));
    }
    @GetMapping("/get-by-nom")
    public ResponseEntity<Optional<CategorieDTO>> getByNom(@RequestParam String nom){
        if(StringUtils.isEmpty(nom)){
            throw new RuntimeException("nom cannot be null");
        }
        return ResponseEntity.ok(categorieService.findOneByNom(nom));
    }
    @GetMapping("")
    public ResponseEntity<List<CategorieDTO>> getAll(){
        return ResponseEntity.ok(categorieService.findAll());
    }

}
