package es.cabsa.javadevelopers.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(
        name = "food",
        uniqueConstraints = @UniqueConstraint(name = "uc_name", columnNames = {"name"})
)
public class FoodDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int id;

    @Column(nullable = false)
    private final String name;

    @ManyToMany(mappedBy = "diet")
    private List<AnimalDO> eatenBy;

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

    public List<AnimalDO> getEatenBy(){
        return eatenBy;
    }
}
