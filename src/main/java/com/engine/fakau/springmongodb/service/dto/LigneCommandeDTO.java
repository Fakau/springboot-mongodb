package com.engine.fakau.springmongodb.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

public class LigneCommandeDTO implements Serializable {
    @NotNull
    private Integer quantite;
    @NotNull
    private BigDecimal prix;
    @NotNull
    private ProduitDTO produit;

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


    public ProduitDTO getProduit() {
        return produit;
    }

    public void setProduit(ProduitDTO produit) {
        this.produit = produit;
    }


    @Override
    public String toString() {
        return "LigneCommandeDTO{" +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", produits=" + produit +
                '}';
    }
}
