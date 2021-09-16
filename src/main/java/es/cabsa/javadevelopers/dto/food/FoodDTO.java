package es.cabsa.javadevelopers.dto.food;
import es.cabsa.javadevelopers.model.AnimalDO;

import javax.validation.constraints.NotNull;
import java.util.List;

public class FoodDTO {

    @NotNull(message = "Name can not be null!")
    private String name;

    private List<String> eatenBy;

    public FoodDTO(){
    }

    public FoodDTO(String name, List<String> eatenBy){
        this.name = name;
        this.eatenBy = eatenBy;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public List<String> getEatenBy(){
        return eatenBy;
    }

    public void setEatenBy(List<String> eatenBy){
        this.eatenBy = eatenBy;
    }
}
