package models;

import models.BakedGood;

import java.util.ArrayList;

public class Bakery {

    private ArrayList<BakedGood> bakedGoods;

    public Bakery(){
        this.bakedGoods = new ArrayList<BakedGood>();
    }

    public int countBakedGoods(){
        return this.bakedGoods.size();
    }

    public void addBakedGood(BakedGood bakedGood){
        this.bakedGoods.add(bakedGood);
    }
}
