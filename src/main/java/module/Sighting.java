package module;


import java.sql.Timestamp;

public class Sighting {
    private int animalId;
    private int id;
    private String location;
    private String rangerName;
    private Timestamp lastSeen;

    public Sightings (int animalId, String location, String rangerName){
        this.animalId = animalId;
        this.location = location;
        this.rangerName = rangerName;

        if (location.isEmpty() || rangerName.isEmpty()){
            throw new IllegalArgumentException("Please enter all input fields.");
        }
    }

    // get methods
    public int getAnimalId() {
        return animalId;
    }

    public int getId() {
        return id;
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

    @Override
    public boolean equals(Object otherSighting){
        if (!(otherSighting instanceof Sighting)) {
            return false;
        } else {
            Sighting newSighting = (Sighting) otherSighting;
            return this.getLocation().equals(newSighting.getLocation()) &&
                    this.getRangerName().equals(newSighting.getRangerName()) &&
                    this.getAnimalId() == newSighting.getAnimalId();
        }
    }

}
