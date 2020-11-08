package com.engine.fakau.springmongodb.repository;

import com.engine.fakau.springmongodb.domaine.LigneCommande;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepository  extends MongoRepository<LigneCommande, Long> {
}
