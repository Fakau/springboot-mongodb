package com.engine.fakau.springmongodb.domaine;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Document(collation = "ligne_commande")
public class LigneCommande {
    @Id
    private Long id;
    private Integer quantite;
    private BigDecimal prix;
    private Commande commande;
    private List<Produit> produits = new ArrayList<Produit>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", commande=" + commande +
                ", produits=" + produits +
                '}';
    }
}
