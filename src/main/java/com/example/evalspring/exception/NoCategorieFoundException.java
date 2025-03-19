package com.example.evalspring.exception;

public class NoCategorieFoundException extends RuntimeException{
    public NoCategorieFoundException(Integer id) {
        super("Il n'y a aucune catégorie correspondant à  l'ID : "+id);
    }
}
