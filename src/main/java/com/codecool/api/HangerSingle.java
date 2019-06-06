package com.codecool.api;

import com.codecool.exceptions.*;

public class HangerSingle extends Hanger {
    
    public HangerSingle(String id) {
        super(id);
    }
    
    protected void addClothing(Clothing clothing) throws HangerFullException, ClothingTypeException {
        if (!(hung == null)) {
            throw new HangerFullException("This hanger is already full!");
        } else if (clothing.getType().equals(ClothingType.SHIRT) || clothing.getType().equals(ClothingType.SKIRT)) {
            hung = clothing;
        } else {
            throw new ClothingTypeException("Wrong type of clothing!");
        }
    }
    
    protected void removeClothing(String id) throws WrongIdException {
        if (hung.getId().equals(id)) {
            hung = null;
        } else {
            throw new WrongIdException("This hanger has no such clothing on!");
        }
    }
}
