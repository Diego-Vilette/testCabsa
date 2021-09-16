package es.cabsa.javadevelopers.controller.mapper;

import es.cabsa.javadevelopers.dto.animal.AnimalDTO;
import es.cabsa.javadevelopers.dto.food.FoodDTO;
import es.cabsa.javadevelopers.dto.food.FoodNameDTO;
import es.cabsa.javadevelopers.model.AnimalDO;
import es.cabsa.javadevelopers.model.FoodDO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoodMapper {

    public static FoodDO toDO(FoodDTO foodDTO)
    {
        return new FoodDO(foodDTO.getName());
    }

    public static FoodDTO toDTO(FoodDO foodDO)
    {
        //If have pretators I make a list of "predator names" to make a more clean response.
        List<String> eatenBy = new ArrayList<String>();
        if(foodDO.getEatenBy() != null && foodDO.getEatenBy().size() > 0){
            eatenBy = foodDO.getEatenBy().stream().map(AnimalDO::getName).collect(Collectors.toList());
        }
        return new FoodDTO(foodDO.getName(), eatenBy);
    }
}
