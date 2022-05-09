package module;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;


public class AnimalsTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    public Animal setUpAnimal(){
        return new Animal();
    }
    @Test
    public void animal_instantiatesCorrectly_true(){
        Animal animal = setUpAnimal();
        assertEquals(true,animal instanceof Animal);
    }
}
