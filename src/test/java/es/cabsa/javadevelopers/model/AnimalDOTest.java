package es.cabsa.javadevelopers.model;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalDOTest {

    @Test
    void idShouldBe1(){
        AnimalDO animal = new AnimalDO(1,"bear",4, null);
        assertEquals(1, animal.getId());
    }

    @Test
    void nameShouldBeBear(){
        AnimalDO animal = new AnimalDO(1,"bear",4, null);
        assertEquals("bear", animal.getName());
    }

    @Test
    void legsShouldBe4(){
        AnimalDO animal = new AnimalDO(1,"bear",4, null);
        assertEquals(1, animal.getLegs());
    }

    @Test
    void dietShouldBeNull(){
        AnimalDO animal = new AnimalDO(1,"bear",4, null);
        assertNull(animal.getDiet());
    }
}