package com.crdtech.product_backend.models;

public class Category {

    // Atributos

        private int id;
        private String name;

    // Métodos construtores

    public Category(int id, String name){

        this.id = id;
        this.name = name;

    }

    public Category() {

    }

    // Métodos


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
