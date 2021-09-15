package es.cabsa.javadevelopers.model;


public class FoodDO {
    private final int id;
    private final String name;

    public FoodDO(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}
