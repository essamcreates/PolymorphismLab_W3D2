package models;

import models.BakedGood;

public abstract class Vegan extends BakedGood {

    public Vegan(String name, String baseFlavour, double sellPrice, double cost){
        super(name, baseFlavour, sellPrice, cost);
    }

    public String noMeatProduce(){
        return "This product has no meat produce";
    }
}
