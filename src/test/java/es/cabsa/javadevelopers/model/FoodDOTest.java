package es.cabsa.javadevelopers.model;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FoodDOTest {

    @Test
    void idShouldBe1(){
        FoodDO food = new FoodDO("carrot");
        assertEquals("carrot", food.getName());
    }

    @Test
    void nameShouldBeCarrot(){
        FoodDO food = new FoodDO("carrot");
        assertEquals("carrot", food.getName());
    }

    @Test
    void eatenByShouldBeNull(){
        FoodDO food = new FoodDO("carrot");
        assertNull(food.getEatenBy());
    }

    @Test
    void shouldSetId(){
        FoodDO food = new FoodDO("carrot");
        food.setId(1);
        assertEquals(1, food.getId());
    }

    @Test
    void shouldSetEatenBy(){
        FoodDO food = new FoodDO("carrot");
        AnimalDO predator = new AnimalDO("bear",null);
        List<AnimalDO> s = new ArrayList<AnimalDO>();
        food.setEatenBy(s);
        assertNotNull(food.getEatenBy());
    }
}
