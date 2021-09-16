package es.cabsa.javadevelopers.dto;

import es.cabsa.javadevelopers.dto.animal.AnimalDTO;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalNameDTOTest {

    @Test
    void nameShouldBeBear(){
        AnimalDTO dto = new AnimalDTO("bear",null);
        assertEquals("bear", dto.getName());
    }

    @Test
    void shouldSetNameSnake(){
        AnimalDTO dto = new AnimalDTO();
        dto.setName("snake");
        assertEquals("snake", dto.getName());
    }
}
