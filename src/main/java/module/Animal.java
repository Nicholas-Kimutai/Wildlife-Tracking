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
}
