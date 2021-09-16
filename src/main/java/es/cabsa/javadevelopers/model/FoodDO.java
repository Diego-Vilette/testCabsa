package es.cabsa.javadevelopers.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "food",
        uniqueConstraints = @UniqueConstraint(name = "uc_food_name", columnNames = {"name"})
)
public class FoodDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "diet")
    private List<AnimalDO> eatenBy;

    public FoodDO(){}

    public FoodDO(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public List<AnimalDO> getEatenBy(){
        return eatenBy;
    }

    public void setEatenBy(List<AnimalDO> eatenBy){
        this.eatenBy = eatenBy;
    }
}
