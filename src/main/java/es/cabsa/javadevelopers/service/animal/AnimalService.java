package es.cabsa.javadevelopers.service.animal;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.AnimalDO;
import es.cabsa.javadevelopers.repository.IAnimalRepository;
import org.springframework.stereotype.Service;

@Service
public class AnimalService implements IAnimalService{

    private final IAnimalRepository iAnimalRepository;

    public AnimalService(IAnimalRepository iAnimalRepository){
        this.iAnimalRepository = iAnimalRepository;
    }

    /**
     * Selects an animal by id.
     *
     * @param animalId
     * @return found animal
     * @throws BadRequestException if no animal with the given id was found.
     */
    @Override
    public AnimalDO find(int animalId) throws BadRequestException {
        return iAnimalRepository.findById(animalId)
                .orElseThrow(() -> new BadRequestException());
    }

    /**
     * Selects an animal by name.
     *
     * @param animalName
     * @return found animal
     * @throws BadRequestException if no animal with the given name was found.
     */
    @Override
    public AnimalDO findByName(String animalName){
        return iAnimalRepository.findByName(animalName)
                .orElseThrow(() -> new BadRequestException());
    }
}
