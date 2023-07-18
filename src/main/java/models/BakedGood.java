package models;

import interfaces.ISell;

public abstract class BakedGood implements ISell {

    protected String name;
    protected String baseFlavour;
    protected double sellPrice;
    protected double cost;

    public BakedGood(String name, String baseFlavour, double sellPrice, double cost){
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.sellPrice = sellPrice;
        this.cost = cost;
    }
    public double calculateMargin(){
        return sellPrice - cost;
    }

    public String expressBaseFlavour(){
        return "This is a" + this.name + "with a base flavour of " + this.baseFlavour;
    }

    @Override
    public double getMargin(){
        return this.calculateMargin();
    }

}
