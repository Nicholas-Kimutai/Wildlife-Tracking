package module;
import org.sql2o.Connection;


public class Animal extends Wildlife implements DatabaseManagement {
    public static final String ANIMAL_TYPE = "animal";


    public Animal(String name){
        this.name = name;
        this.type = ANIMAL_TYPE;
        if (name.isEmpty()){
            throw new IllegalArgumentException("Please enter the animal's name.");
        }
    }
    @Override
    public boolean equals(Object otherAnimal){
        if (!(otherAnimal instanceof Animal)) {
            return false;
        } else {
            Animal newAnimal = (Animal) otherAnimal;
            return this.getName().equals(newAnimal.getName());
        }
    }
}
