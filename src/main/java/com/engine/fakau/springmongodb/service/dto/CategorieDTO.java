package com.engine.fakau.springmongodb.service.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class CategorieDTO implements Serializable {
    @NotNull
    private Long id;
    @NotNull
    private String nom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieDTO categorie = (CategorieDTO) o;
        return categorie.getNom().equals(((CategorieDTO) o).getNom());
    }


    @Override
    public String toString() {
        return "Categorie{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }

}
