package module;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;


public class AnimalsTest {
    @Rule
    public module.DBRule DBRule = new module.DBRule();

    public Animal setUpAnimal(){
        return new Animal("Lion");
    }
    @Test
    public void animal_instantiatesCorrectly_true(){
        Animal animal = setUpAnimal();
        assertEquals(true,animal instanceof Animal);
    }
    @Test
    public void save_successfullyAddsAnimalToDatabase_List() {
        Animal animal = setUpAnimal();
        animal.save();
        assertTrue(Animal.all().get(0).equals(animal));
    }

    @Test
    public void save_assignsIdToAnimal() {
        Animal animal = setUpAnimal();
        animal.save();
        Animal savedAnimal = Animal.all().get(0);
        assertEquals(savedAnimal.getId(), animal.getId());
    }
}
