package com.engine.fakau.springmongodb.rest;

import com.engine.fakau.springmongodb.service.dto.ProduitDTO;
import com.engine.fakau.springmongodb.service.serviceImpl.ProduitServiceImpl;
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
    public ProduitDTO save(@Valid @RequestBody ProduitDTO produitDTO){
        if(produitDTO.getId() != null){
            throw new RuntimeException("Cannot save produitDTO with id <> null");
        }
        return produitService.save(produitDTO);
    }
    @PutMapping("")
    public ProduitDTO update(@Valid @RequestBody ProduitDTO produitDTO){
        if(produitDTO.getId() == null){
            throw new RuntimeException("Cannot update categorie with id == null");
        }
        return produitService.save(produitDTO);
    }
    @GetMapping("/{id}")
    public Optional<ProduitDTO> findById(@PathVariable Long id){
        return produitService.findOneById(id);
    }
    @GetMapping("/search")
    public List<ProduitDTO> search(@RequestParam String keyWord){
        if(StringUtils.isEmpty(keyWord)){
            throw new RuntimeException("keyWord cannot be null");
        }
        return produitService.search(keyWord);
    }
    @GetMapping("")
    public List<ProduitDTO> getAll(){
        return produitService.findAll();
    }

}
