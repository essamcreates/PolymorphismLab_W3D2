package models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarrotCakeTest {

    CarrotCake carrotCake;

    @BeforeEach
    void setUp() {

        carrotCake = new CarrotCake(true);

    }

    @Test
    void hasVegetable() {
        Boolean result = Boolean.valueOf(carrotCake.hasVegetable(true));
        assertThat(result).isEqualTo(false);
    }

    @Test
    void addCustard() {
        String result = carrotCake.addCustard(true);
                assertThat(result).isEqualTo("has custard");
    }

    @Test
    void expressBaseFlavour() {
        String result = carrotCake.expressBaseFlavour();
        assertThat(result).isEqualTo("This is a Carrot Cake with a base flavour of chocolate");

    }
}