package es.cabsa.javadevelopers.repository;
import org.springframework.data.repository.CrudRepository;
import es.cabsa.javadevelopers.model.AnimalDO;

import java.util.List;

/**
 * Database Access Object for animal table.
 */
public interface IAnimalRepository extends CrudRepository<AnimalDO, Integer>{

    List<AnimalDO> findByName(String name);

}
