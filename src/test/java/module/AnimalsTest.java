package module;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;


public class AnimalsTest {
    @Rule
    public DatabaseRule databaseRule = new DatabaseRule();

    public Animals setUpAnimal(){
        return new Animals();
    }
    @Test
    public void animal_instantiatesCorrectly_true(){
        Animals animal = setUpAnimal();
        assertEquals(true,animal instanceof Animals);
    }
}
