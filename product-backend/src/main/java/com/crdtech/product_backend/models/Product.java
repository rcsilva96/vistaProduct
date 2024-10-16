package com.crdtech.product_backend.models;

import java.util.List;

public class Product {

    // Atributos

    private int id;
    private String name;
    private String description;
    private int idCategory;
    private double price;
    private boolean promotion;
    private boolean newProduct;

    // Métodos construtores

    public Product(int id, String name, String description, int idCategory, double price, boolean promotion, boolean newProduct){

        this.id = id;
        this.name = name;
        this.description = description;
        this.idCategory = idCategory;
        this.price = price;
        this.promotion = promotion;
        this.newProduct = newProduct;

    }

    public Product(){
abut
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPromotion() {
        return promotion;
    }

    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }
}
