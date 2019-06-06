package com.codecool.api;

import java.util.List;

public class Wardrobe {
    private int size;
    private List<Hanger> hangers;
    private List<Clothing> clothing;
    
    public Wardrobe(int size) {
        this.size = size;
    }
}
