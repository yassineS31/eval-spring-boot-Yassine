package com.example.evalspring.exception;

public class NoCategoriesFoundException extends RuntimeException{
    public NoCategoriesFoundException() {
        super("Aucune catégories enregistrés en BDD");
    }
}
