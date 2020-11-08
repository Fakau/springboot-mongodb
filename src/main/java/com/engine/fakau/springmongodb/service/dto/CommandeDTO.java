package com.engine.fakau.springmongodb.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommandeDTO implements Serializable {
    @NotNull
    private Long id;
    @NotNull
    private BigDecimal prix;
    @NotNull
    private Integer quantiteTotalProduit;
    @NotNull
    private List<LigneCommandeDTO> ligneCommandes = new ArrayList<LigneCommandeDTO>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                ", prix=" + prix +
                ", quantiteTotalProduit=" + quantiteTotalProduit +
                ", ligneCommandes=" + ligneCommandes +
                '}';
    }
}
