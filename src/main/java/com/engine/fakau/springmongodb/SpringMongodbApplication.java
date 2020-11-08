package com.engine.fakau.springmongodb;

import com.engine.fakau.springmongodb.domaine.Categorie;
import com.engine.fakau.springmongodb.domaine.Produit;
import com.engine.fakau.springmongodb.repository.CategorieRepository;
import com.engine.fakau.springmongodb.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class SpringMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

}
