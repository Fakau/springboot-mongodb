package com.engine.fakau.springmongodb.repository;

import com.engine.fakau.springmongodb.domaine.Categorie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends MongoRepository<Categorie, Long> {
    Categorie findFirstByNom(String nom);
}
