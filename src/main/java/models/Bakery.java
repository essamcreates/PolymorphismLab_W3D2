package models;

import interfaces.ISell;
import models.BakedGood;

import java.util.ArrayList;

public class Bakery {

    private ArrayList<ISell> bakeryGoods;
    private double till;

    public Bakery(){
        this.bakeryGoods = new ArrayList<ISell>();
        this.till = 0;
    }

    public void addToTill(){
        for (int i = 0; i < bakeryGoods.size() ; i++) {
        this.till += bakeryGoods.get(i).getMargin();
        }
    }

    public double getTill() {
        return till;
    }

    public int countBakeryGoods(){
        return this.bakeryGoods.size();
    }

    public void addBakeryGood(ISell iSell){
        this.bakeryGoods.add(iSell);
    }



}
