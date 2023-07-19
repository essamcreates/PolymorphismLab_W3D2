package models;

import models.Vegan;

public class VeganChocolateCake extends Vegan {

    public VeganChocolateCake(String name, String baseFlavour, double sellPrice, double cost){
        super(name, baseFlavour, sellPrice, cost);
    }

    @Override
    public String expressBaseFlavour(){
        return "This is a " + this.name + "with a base flavour of " + this.baseFlavour;
    }

//    overload
    public String expressBaseFlavour(String message){
        return "This is a " + this.name + "with a base flavour of " + this.baseFlavour;
    }



}
