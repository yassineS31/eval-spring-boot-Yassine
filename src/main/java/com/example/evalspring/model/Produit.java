package com.example.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nom",nullable = false,length = 50)
    @NotBlank(message = "Le champs doit être rempli")
    @Min(value = 2,message = "Le nom doit avoir plus de 2 caractères")
    private String nom;

    @Column(name = "prix",nullable = false )
    @NotBlank(message = "Le prix doit être renseigné")
    @DecimalMin(value = "0.01",message = "Le prix doit être supérieur à 0 €")
    private double prix;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;
    //Constructeurs :
    public Produit() {}
    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    // Getters et Setters :


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}

