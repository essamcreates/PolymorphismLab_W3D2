package models;

import interfaces.ISell;
import models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;

    Coffee coffee;
    BakedGood weddingCake;
    BakedGood carrotCake;

    @BeforeEach
    void setUp(){
        bakery = new Bakery();
        coffee = new Coffee("arabica", "floral", 10, 20);
        weddingCake = new WeddingCake("wedding cake", true, 3);
        carrotCake = new CarrotCake(true);
        bakery.addBakeryGood(weddingCake);
        bakery.addBakeryGood(carrotCake);
    }

    @Test
    void canCountBakeryGoods(){
        assertThat(bakery.countBakeryGoods()).isEqualTo(2);
    }


    @Test
    void canAddBakeryGoods(){
        bakery.addBakeryGood(carrotCake);
        assertThat(bakery.countBakeryGoods()).isEqualTo(3);
    }

    @Test
    void canAddMultipleBakeryGoods(){
        bakery.addBakeryGood(coffee);
        bakery.addBakeryGood(weddingCake);
        assertThat(bakery.countBakeryGoods()).isEqualTo(4);
    }

    @Test
    void canCalculateMargin(){
        bakery.addBakeryGood(coffee);
        bakery.addBakeryGood(weddingCake);
        bakery.addToTill();
        assertThat(bakery.getTill()).isEqualTo(100);
    }


}
