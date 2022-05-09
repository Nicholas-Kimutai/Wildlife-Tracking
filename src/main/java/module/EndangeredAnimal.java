package module;

public class EndangeredAnimal extends Wildlife implements DatabaseManagement{
    public static final String ANIMAL_TYPE = "endangered-animal";
    public  EndangeredAnimal(String name, String health, String age){
        this.name = name;
        this.health = health;
        this.age = age;
        this.type = ANIMAL_TYPE;

        if (name.isEmpty() || health.isEmpty() || age.isEmpty()){
            throw new IllegalArgumentException("Please enter all input fields.");
        }
    }
}
