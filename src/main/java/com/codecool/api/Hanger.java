package com.codecool.api;

import com.codecool.exceptions.ClothingTypeException;
import com.codecool.exceptions.HangerFullException;
import com.codecool.exceptions.WrongIdException;

public abstract class Hanger {
    Clothing hung = null;
    String id;
    
    Hanger(String id) {
        this.id = id;
    }
    
    public Clothing getHung() {
        return hung;
    }
    
    protected abstract void addClothing(Clothing clothing) throws HangerFullException, ClothingTypeException;

    protected abstract void removeClothing(String id) throws WrongIdException;
    
    protected String getId() {
        return id;
    }
}
