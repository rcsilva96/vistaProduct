package com.crdtech.product_backend.controllers;

import com.crdtech.product_backend.models.Category;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoryController {

    private List<Category> categories = Arrays.asList(  new Category(1, "Fabricação própria"),
                                                        new Category(2, "Nacional"),
                                                        new Category(3,"Importado")
            );

@GetMapping("categories/{id}")
public ResponseEntity<Category> getCategory(@PathVariable int id){

    Category cat = categories.stream()
            .filter(c -> c.getId() == id)
            .findFirst()
            .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Categoria não encontrada")
            );

    return ResponseEntity.ok(cat);

}

@GetMapping("categories")

    public List<Category> getCategories(){
    return categories;
}
}