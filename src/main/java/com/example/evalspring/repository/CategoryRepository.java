package com.example.evalspring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.evalspring.model.Categorie;

@Repository
public interface CategoryRepository extends CrudRepository<Categorie, Integer> {
}
