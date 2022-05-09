package module;

public class EndangeredAnimal extends Wildlife implements DatabaseManagement{
    public static final String ANIMAL_TYPE = "endangered-animal";
    public  EndangeredAnimal(String name, String health, String age){
        this.name = name;
        this.health = health;
        this.age = age;
        this.type = ANIMAL_TYPE;

        if (name.isEmpty() || health.isEmpty() || age.isEmpty()){
            throw new IllegalArgumentException("Please input all fields.");
        }
    }

    @Override
    public boolean equals(Object otherAnimal){
        if (!(otherAnimal instanceof EndangeredAnimal)) {
            return false;
        } else {
            EndangeredAnimal newAnimal = (EndangeredAnimal) otherAnimal;
            return this.getName().equals(newAnimal.getName()) &&
                    this.getHealth().equals(newAnimal.getHealth()) &&
                    this.getAge().equals(newAnimal.getAge());
        }
    }
}
