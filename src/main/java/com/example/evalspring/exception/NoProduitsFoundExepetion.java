package com.example.evalspring.exception;

public class NoProduitsFoundExepetion  extends  RuntimeException {

    public NoProduitsFoundExepetion() {
        super("La BDD ne contient aucun produit");
    }
}
