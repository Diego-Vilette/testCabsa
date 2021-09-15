package es.cabsa.javadevelopers.service;

import es.cabsa.javadevelopers.exceptions.BadRequestException;
import es.cabsa.javadevelopers.model.AnimalDO;
import es.cabsa.javadevelopers.repository.IAnimalRepository;
import es.cabsa.javadevelopers.service.animal.AnimalService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnimalServiceTest {

    IAnimalRepository iAnimalRepositoryMock = mock(IAnimalRepository.class);
    AnimalService animalService = new AnimalService(iAnimalRepositoryMock);

    @Test
    void ShouldFindAnimalById() {
        AnimalDO animal = new AnimalDO(1,"bear", 4, null);
        Optional<AnimalDO> optional = Optional.of(animal);

        when(iAnimalRepositoryMock.findById(1)).thenReturn(optional);

        AnimalDO savedAnimal = animalService.find(1);

        assertEquals(savedAnimal.getId(), animal.getId());
    }

    @Test
    void ShouldThrowExceptionFindingById() {
        AnimalDO animal = new AnimalDO(1,"bear", 4, null);
        Optional<AnimalDO> optional = Optional.of(animal);

        when(iAnimalRepositoryMock.findById(2)).thenThrow(new BadRequestException());

        assertThrows(BadRequestException.class, () -> animalService.find(2));
    }

    @Test
    void ShouldFindTheAnimalByName() {
        AnimalDO animal = new AnimalDO(1,"bear", 4, null);
        Optional<AnimalDO> optional = Optional.of(animal);

        when(iAnimalRepositoryMock.findByName("bear")).thenReturn(optional);

        AnimalDO savedAnimal = animalService.findByName("bear");

        assertEquals(savedAnimal.getName(), animal.getName());
    }

    @Test
    void ShouldThrowExceptionFindingByName() {
        AnimalDO animal = new AnimalDO(1,"bear", 4, null);
        Optional<AnimalDO> optional = Optional.of(animal);

        when(iAnimalRepositoryMock.findByName("b")).thenThrow(new BadRequestException());

        assertThrows(BadRequestException.class, () -> animalService.findByName("b"));
    }

}
