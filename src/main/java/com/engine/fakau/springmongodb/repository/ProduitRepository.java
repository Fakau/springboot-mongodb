package com.engine.fakau.springmongodb.repository;
import com.engine.fakau.springmongodb.domaine.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends MongoRepository<Produit, Long> {
}
