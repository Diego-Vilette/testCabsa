package es.cabsa.javadevelopers.dto.animal;

/**
 * DTO only to show the name of my Animal
 */
public class AnimalNameDTO {

    private String name;

    public AnimalNameDTO(){
    }

    public AnimalNameDTO(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
