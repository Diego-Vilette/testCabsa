package es.cabsa.javadevelopers.dto;
import es.cabsa.javadevelopers.dto.animal.AnimalDTO;
import es.cabsa.javadevelopers.dto.food.FoodNameDTO;
import es.cabsa.javadevelopers.model.FoodDO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalDTOTest {

    @Test
    void nameShouldBeBear(){
        AnimalDTO dto = new AnimalDTO("bear",null);
        assertEquals("bear", dto.getName());
    }

    @Test
    void dietShouldBeNull(){
        AnimalDTO dto = new AnimalDTO("bear",null);
        assertNull(dto.getDiet());
    }

    @Test
    void shouldSetNameSnake(){
        AnimalDTO dto = new AnimalDTO();
        dto.setName("snake");
        assertEquals("snake", dto.getName());
    }

    @Test
    void shouldSetDiet(){
        AnimalDTO dto = new AnimalDTO();
        List<String> diet = new ArrayList<String>();
        diet.add("vermin");
        dto.setDiet(diet);
        assertNotNull(dto.getDiet());
    }

}
