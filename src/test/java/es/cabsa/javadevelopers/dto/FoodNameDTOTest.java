package es.cabsa.javadevelopers.dto;

import es.cabsa.javadevelopers.dto.food.FoodDTO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FoodNameDTOTest {

    @Test
    void nameShouldBeCarrot(){
        FoodDTO dto = new FoodDTO("carrot", null);
        assertEquals("carrot", dto.getName());
    }

    @Test
    void shouldSetNameVermin(){
        FoodDTO dto = new FoodDTO();
        dto.setName("vermin");
        assertEquals("vermin", dto.getName());
    }

}
