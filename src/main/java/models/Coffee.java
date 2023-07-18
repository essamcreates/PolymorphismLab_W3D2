package models;

import interfaces.ISell;

public class Coffee implements ISell {

    private String coffeeBean;
    private String coffeeAroma;
    private double cost;
    private double sellPrice;

    public Coffee(String coffeeBean, String coffeeAroma, double cost, double sellPrice){
        this.coffeeBean = coffeeBean;
        this.coffeeAroma = coffeeAroma;
        this.cost = cost;
        this.sellPrice = sellPrice;
    }

    public double calculateMargin(){
        return sellPrice - cost;
    }


    @Override
    public double getMargin() {
        return calculateMargin();
    }
}
