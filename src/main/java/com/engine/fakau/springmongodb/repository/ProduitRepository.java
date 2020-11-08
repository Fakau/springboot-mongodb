package com.engine.fakau.springmongodb.repository;
import com.engine.fakau.springmongodb.domaine.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProduitRepository extends MongoRepository<Produit, Long> {
    List<Produit> search(String keyWord);
    Optional<Produit> findOneById(Long id);
}
