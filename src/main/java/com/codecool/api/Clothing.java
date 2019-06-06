package com.codecool.api;

public class Clothing {
    private String id;
    private String brand;
    private ClothingType type;
    
    public Clothing(String id, String brand, ClothingType type) {
        this.id = id;
        this.brand = brand;
        this.type = type;
    }
    
    public String getId() {
        return id;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public ClothingType getType() {
        return type;
    }
}
