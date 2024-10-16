package com.crdtech.product_backend.controllers;

import com.crdtech.product_backend.models.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    private List<Product> products = Arrays.asList( new Product(1, "TV", "Uma televisão de 42 polegadas", 1, 1500.00, true, true),
                                                    new Product(2, "Celular", "Galaxy s23 Ultra 512gb", 2, 2200.00, false, true),
                                                    new Product(3, "Nintendo Switch", "O melhor videogame da geração", 3, 1400.00, false, false)
    );

    @GetMapping("products/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id){

        Product prod = products.stream().
                filter( p -> p.getId() == id)
                .findFirst()
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado")
                );

        return ResponseEntity.ok(prod);

    }

    @GetMapping("products")
    public List<Product> getProducts() {

        return products;

    }

}
