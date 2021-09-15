package es.cabsa.javadevelopers.service.animal;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.AnimalDO;

public interface IAnimalService {

    AnimalDO find(int animalId) throws BadRequestException;

    AnimalDO findByName(String animalName) throws BadRequestException;

}
