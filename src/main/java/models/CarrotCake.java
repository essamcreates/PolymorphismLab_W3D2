package models;

import models.BakedGood;

public class CarrotCake extends BakedGood {

    private boolean hasVegetable;
    private boolean hasCustard;

    public CarrotCake(boolean hasVegetable){
        super("Carrot Cake", "chocolate", 20, 10);
        this.hasVegetable = hasVegetable;
        this.hasCustard = false;
    }

    public String hasVegetable(boolean hasVegetable){
        if (this.hasVegetable){
            return "has vegetable";
        }
        return null;
    }

    public String addCustard(boolean addCustard){
        this.hasCustard = addCustard;
        if (this.hasCustard){
            return "has custard";
        } else {
            return "has no custard";
        }
    }

    @Override
    public String expressBaseFlavour(){
        return "This is a " + this.name + "with a base flavour of " + this.baseFlavour;
    }

}
