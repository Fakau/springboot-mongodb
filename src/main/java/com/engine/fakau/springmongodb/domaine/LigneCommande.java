package com.engine.fakau.springmongodb.domaine;

import java.math.BigDecimal;

public class LigneCommande {
    private Integer quantite;
    private BigDecimal prix;
    private Produit produit;

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

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    @Override
    public String toString() {
        return "LigneCommande{" +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", produits=" + produit +
                '}';
    }
}
