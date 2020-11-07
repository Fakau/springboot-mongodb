package com.engine.fakau.springmongodb.service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommandeDTO implements Serializable {
    private Long id;
    private Integer quantite;
    private BigDecimal prix;
    private Integer quantiteTotalProduit;
    private List<LigneCommandeDTO> ligneCommandes = new ArrayList<LigneCommandeDTO>();

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

    public Integer getQuantiteTotalProduit() {
        return quantiteTotalProduit;
    }

    public void setQuantiteTotalProduit(Integer quantiteTotalProduit) {
        this.quantiteTotalProduit = quantiteTotalProduit;
    }

    public List<LigneCommandeDTO> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommandeDTO> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", quantite=" + quantite +
                ", prix=" + prix +
                ", quantiteTotalProduit=" + quantiteTotalProduit +
                ", ligneCommandes=" + ligneCommandes +
                '}';
    }
}
