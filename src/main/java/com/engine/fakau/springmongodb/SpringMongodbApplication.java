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
	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

	@Bean
	public void init() {
		Produit p = new Produit();
		p.setId(1L);
		p.setNom("Technologie 2");
		p.setDescription("desc");
		p.setPrix(new BigDecimal(56.00));
		System.out.println(produitRepository.save(p));
	}

}
