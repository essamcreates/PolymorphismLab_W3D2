package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VeganChocolateCakeTest {

    VeganChocolateCake veganChocolateCake;


    @BeforeEach
    public void setUp(){

        veganChocolateCake = new VeganChocolateCake("vegan chocolate cake", "orange", 20, 10);

    }

    @Test
    public void canCheckForAnimalProduce(){
        assertThat(veganChocolateCake.noAnimalProduce()).isEqualTo("This product has no animal produce");
    }

//    BakedGood getters and setters test



//    ISell test
    @Test
    public void isellTest(){
        veganChocolateCake.calculateMargin();
        assertThat(veganChocolateCake.getMargin()).isEqualTo(10);
    }



}
