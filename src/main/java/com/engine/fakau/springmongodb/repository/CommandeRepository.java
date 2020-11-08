package com.engine.fakau.springmongodb.repository;

import com.engine.fakau.springmongodb.domaine.Commande;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandeRepository extends MongoRepository<Commande, Long> {
}
