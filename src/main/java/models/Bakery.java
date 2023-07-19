package models;

import interfaces.ISell;
import models.BakedGood;

import java.util.ArrayList;

public class Bakery {

    private ArrayList<ISell> produceStock;
    private double till;

    public Bakery(){
        this.produceStock = new ArrayList<ISell>();
        this.till = 0;
    }

    public void addToTill(){
        for (int i = 0; i < produceStock.size() ; i++) {
        this.till += produceStock.get(i).getMargin();
        }
    }

    public double getTill() {
        return till;
    }

    public int countBakeryGoods(){
        return this.produceStock.size();
    }

    public void addBakeryGood(ISell iSell){
        this.produceStock.add(iSell);
    }



}
