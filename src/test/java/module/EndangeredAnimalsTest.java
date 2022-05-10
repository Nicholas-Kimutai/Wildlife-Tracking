package module;

import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalsTest {

    @Rule
    public module.DBRule DBRule = new module.DBRule();

    public EndangeredAnimal setUpEndangeredAnimal(){
        return new EndangeredAnimal("Rhino","ill","adult");
    }

    @Test
    public void endangeredAnimal_instantiatesCorrectly_true(){
        EndangeredAnimal animal = setUpEndangeredAnimal();
        assertEquals(true,animal instanceof EndangeredAnimal);
    }

    @Test
    public void save_successfullyAddsEndangeredAnimalToDatabase_List() {
        EndangeredAnimal animal = setUpEndangeredAnimal();
        animal.save();
        assertTrue(EndangeredAnimal.all().get(0).equals(animal));
    }

}
