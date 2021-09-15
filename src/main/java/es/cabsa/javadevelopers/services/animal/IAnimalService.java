package es.cabsa.javadevelopers.services.animal;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.AnimalDO;

import java.util.List;

public interface IAnimalService {

    AnimalDO find(int animalId) throws BadRequestException;

    AnimalDO findByName(String animalName) throws BadRequestException;

}
