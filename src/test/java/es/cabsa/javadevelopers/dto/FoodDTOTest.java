package es.cabsa.javadevelopers.dto;
import es.cabsa.javadevelopers.model.AnimalDO;
import es.cabsa.javadevelopers.model.FoodDO;
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
    void shouldSetDiet(){
        FoodDTO dto = new FoodDTO();
        List<AnimalDO> eatenBy = new ArrayList<AnimalDO>();
        AnimalDO predator = new AnimalDO(1, "snake",0, null);
        eatenBy.add(predator);
        dto.setDiet(eatenBy);
        assertNotNull(dto.getEatenBy());
    }

}
