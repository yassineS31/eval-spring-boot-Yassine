package com.example.evalspring.exception;
import com.example.evalspring.model.Produit;


public class ProduitExist extends RuntimeException {
    public ProduitExist(Produit produit) {
        super("Le produit : " + produit.getNom() +" existe déjà en bdd ");
    }
}