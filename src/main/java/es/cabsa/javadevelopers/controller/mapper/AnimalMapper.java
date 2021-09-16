package es.cabsa.javadevelopers.controller.mapper;

import es.cabsa.javadevelopers.dto.animal.AnimalDTO;
import es.cabsa.javadevelopers.model.AnimalDO;
import es.cabsa.javadevelopers.model.FoodDO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Mapper of Animal DO to TDO
 */
public class AnimalMapper {

    public static AnimalDTO toDTO(AnimalDO animalDO)
    {
        //I make a list of "food names" to make a more clean response.
        List<String> diet = animalDO.getDiet().stream().map(FoodDO::getName).collect(Collectors.toList());
        return new AnimalDTO(animalDO.getName(), diet);
    }
}
