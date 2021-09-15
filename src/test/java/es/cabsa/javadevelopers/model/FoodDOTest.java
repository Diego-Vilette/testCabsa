package es.cabsa.javadevelopers.model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FoodDOTest {

    @Test
    void idShouldBe1(){
        FoodDO food = new FoodDO(1,"carrot");
        assertEquals(1, food.getId());
    }

    @Test
    void nameShouldBeCarrot(){
        FoodDO food = new FoodDO(1,"carrot");
        assertEquals("carrot", food.getName());
    }

    @Test
    void eatenByShouldBeNull(){
        FoodDO food = new FoodDO(1,"carrot");
        assertNull(food.getEatenBy());
    }
}
