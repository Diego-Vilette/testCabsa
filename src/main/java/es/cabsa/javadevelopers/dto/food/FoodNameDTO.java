package es.cabsa.javadevelopers.dto.food;

/**
 * DTO only to show the name of my Food
 */
import java.util.List;

public class FoodNameDTO {
    private String name;

    public FoodNameDTO(){
    }

    public FoodNameDTO(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
