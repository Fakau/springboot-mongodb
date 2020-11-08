package com.engine.fakau.springmongodb.repository;
import com.engine.fakau.springmongodb.domaine.Categorie;
import com.engine.fakau.springmongodb.domaine.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitRepository extends MongoRepository<Produit, Long> {
    @Query("{'nom': {$regex: ?0}, 'description': {$regex: ?0}, 'categorie.nom': {$regex: ?0}}")
    List<Produit> search(String keyWord);
    Optional<Produit> findOneById(Long id);
}
