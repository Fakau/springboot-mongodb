package com.engine.fakau.springmongodb.rest;

import com.engine.fakau.springmongodb.service.dto.CategorieDTO;
import com.engine.fakau.springmongodb.service.serviceImpl.CategorieServiceImpl;
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
    public CategorieDTO save(@Valid @RequestBody CategorieDTO categorieDTO){
        if(categorieDTO.getId() != null){
            throw new RuntimeException("Cannot save categorie with id <> null");
        }
        return categorieService.save(categorieDTO);
    }
    @PutMapping("")
    public CategorieDTO update(@Valid @RequestBody CategorieDTO categorieDTO){
        if(categorieDTO.getId() == null){
            throw new RuntimeException("Cannot update categorie with id == null");
        }
        return categorieService.save(categorieDTO);
    }
    @GetMapping("/{id}")
    public Optional<CategorieDTO> findById(@PathVariable Long id){
        return categorieService.findOneById(id);
    }
    @GetMapping("/get-by-nom")
    public Optional<CategorieDTO> getByNom(@RequestParam String nom){
        if(StringUtils.isEmpty(nom)){
            throw new RuntimeException("nom cannot be null");
        }
        return categorieService.findOneByNom(nom);
    }
    @GetMapping("")
    public List<CategorieDTO> getAll(){
        return categorieService.findAll();
    }

}
