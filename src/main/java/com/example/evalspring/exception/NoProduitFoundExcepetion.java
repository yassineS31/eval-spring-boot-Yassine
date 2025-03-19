package com.example.evalspring.exception;

public class NoProduitFoundExcepetion  extends  RuntimeException {

    public NoProduitFoundExcepetion(Integer id) {
        super("Le produit dont l'id est "+ id + " n'existe pas");
    }
}
