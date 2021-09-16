package es.cabsa.javadevelopers.dto;
import es.cabsa.javadevelopers.model.AnimalDO;

import java.util.List;

public class FoodDTO {
    private String name;
    private List<AnimalDO> eatenBy;

    public FoodDTO(){
    }

    public FoodDTO(String name, List<AnimalDO> eatenBy){
        this.name = name;
        this.eatenBy = eatenBy;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<AnimalDO> getEatenBy(){
        return eatenBy;
    }

    public void setDiet(List<AnimalDO> eatenBy){
        this.eatenBy = eatenBy;
    }
}
