package com.example.demo.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Categorie;
@RepositoryRestResource(path="cat")
@CrossOrigin(origins = "http://localhost:4200/")
public interface CategorieRepository  extends JpaRepository<Categorie, Long>{
    
}
