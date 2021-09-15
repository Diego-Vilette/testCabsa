package es.cabsa.javadevelopers.repository;
import org.springframework.data.repository.CrudRepository;
import es.cabsa.javadevelopers.model.AnimalDO;

import java.util.List;
import java.util.Optional;

/**
 * Database Access Object for animal table.
 */
public interface IAnimalRepository extends CrudRepository<AnimalDO, Integer>{

    Optional<AnimalDO> findByName(String name);

}
