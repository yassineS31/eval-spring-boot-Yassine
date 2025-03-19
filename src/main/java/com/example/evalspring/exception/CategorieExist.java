package com.example.evalspring.exception;

public class CategorieExist extends RuntimeException {
    public CategorieExist() {
        super("Le produit existe déjà en bdd ");
    }

}
