package com.engine.fakau.springmongodb.repository;

import com.engine.fakau.springmongodb.domaine.Categorie;
import com.engine.fakau.springmongodb.service.dto.CategorieDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategorieRepository extends MongoRepository<Categorie, Long> {
    Optional<Categorie> findOneByNom(String nom);
    Optional<Categorie> findOneById(Long id);
}
