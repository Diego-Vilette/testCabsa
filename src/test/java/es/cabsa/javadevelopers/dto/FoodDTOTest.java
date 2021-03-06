package es.cabsa.javadevelopers.dto;
import es.cabsa.javadevelopers.dto.food.FoodDTO;
import es.cabsa.javadevelopers.model.AnimalDO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FoodDTOTest {

    @Test
    void nameShouldBeCarrot(){
        FoodDTO dto = new FoodDTO("carrot", null);
        assertEquals("carrot", dto.getName());
    }

    @Test
    void dietShouldBeNull(){
        FoodDTO dto = new FoodDTO("carrot", null);
        assertNull(dto.getEatenBy());
    }

    @Test
    void shouldSetNameSnake(){
        FoodDTO dto = new FoodDTO();
        dto.setName("vermin");
        assertEquals("vermin", dto.getName());
    }

    @Test
    void shouldSetEatenBy(){
        FoodDTO dto = new FoodDTO();
        List<String> eatenBy = new ArrayList<String>();
        eatenBy.add("predator");
        dto.setEatenBy(eatenBy);
        assertNotNull(dto.getEatenBy());
    }

}
