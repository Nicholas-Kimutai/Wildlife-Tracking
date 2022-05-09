package module;

import java.sql.Timestamp;

public class AllSighting {
    private int animalId;
    private String location;
    private String rangerName;
    private Timestamp lastSeen;
    public String name;
    public int id;
    public String health;
    public String age;
    public String type;

    public AllSighting(String name, String health, String age, String location, String rangerName, String type, Timestamp lastSeen){
        this.name = name;
        this.health = health;
        this.age = age;
        this.location = location;
        this.rangerName = rangerName;
        this.type = type;
        this.lastSeen = lastSeen;

    }

    //get methods
    public int getAnimalId() {
        return animalId;
    }

    public String getLocation() {
        return location;
    }

    public String getRangerName() {
        return rangerName;
    }

    public Timestamp getLastSeen() {
        return lastSeen;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }

    public String getHealth() {
        return health;
    }

    public String getAge() {
        return age;
    }

    public String getType() {
        return type;
    }
}
