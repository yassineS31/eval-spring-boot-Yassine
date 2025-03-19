package com.example.evalspring.service;

import com.example.evalspring.exception.CategorieExist;
import com.example.evalspring.exception.NoCategorieFoundException;
import com.example.evalspring.exception.NoProduitsFoundExepetion;
import com.example.evalspring.model.Categorie;
import com.example.evalspring.model.Produit;
import com.example.evalspring.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {
    @Autowired
    private CategoryRepository categoryRepository;

    // Ajouter une categorie
    public Categorie addCategorie(Categorie categorie){
        if (categoryRepository.existsById(categorie.getId())) {
            throw new CategorieExist();
        }
        return categoryRepository.save(categorie);
    }

    //Récupérer une catégorie par ID
    public Categorie getCategorie(int id){
        if(!categoryRepository.existsById(id)){
            throw new NoCategorieFoundException(id);
        }
        return categoryRepository.findById(id).get();
    }

    //Récuperer la liste de toutes les catégories
    public List<Categorie> getAllProduits(){
        if(categoryRepository.count()==0){
            throw new NoProduitsFoundExepetion();
        }
        return (List<Categorie>) categoryRepository.findAll();
    }

}
