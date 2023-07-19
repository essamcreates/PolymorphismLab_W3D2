package models;

import models.BakedGood;

public class WeddingCake extends BakedGood {

    protected boolean hasTiers;
    protected int numOfTiers;
    private boolean hasCandle;
    public WeddingCake(String name, boolean hasTiers, int numOfTiers){
        super("Wedding Cake","vanilla", 100, 60);
        this.hasTiers = hasTiers;
        this.numOfTiers = numOfTiers;
    }



    public String addCandle(boolean addCandle){
        this.hasCandle = addCandle;
        if (this.hasCandle){
            return "has candles";
        } else {
            return "has no candles";
        }
    }

    @Override
    public String expressBaseFlavour(){
        return "This is a " + this.name + "with a base flavour of " + this.baseFlavour;
    }




}
