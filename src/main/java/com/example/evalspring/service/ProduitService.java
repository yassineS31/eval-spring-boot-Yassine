package com.example.evalspring.service;

import com.example.evalspring.exception.NoProduitFoundExcepetion;
import com.example.evalspring.exception.NoProduitsFoundExepetion;
import com.example.evalspring.exception.ProduitExist;
import com.example.evalspring.model.Produit;
import com.example.evalspring.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService  {

    @Autowired
    private ProduitRepository produitRepository;

    //Ajouter un produit
    public Produit ajouterproduit(){
        Produit produit = new Produit();
        if(!produitRepository.existsById(produit.getId())){
            throw new ProduitExist(produit);
        }
        return produit =produitRepository.save(produit);
    }
    //Récupérer un produit par son Id
    public Produit getProduit(Integer id) {
        if(!produitRepository.existsById(id)){
            throw new NoProduitFoundExcepetion(id);
        }
        return produitRepository.findById(id).get();
    }

    //Récupérer la liste de tous les produits
    public List<Produit> getAllProduits(){
        if(produitRepository.count()==0){
            throw new NoProduitsFoundExepetion();
        }
        return (List<Produit>) produitRepository.findAll();
    }

}