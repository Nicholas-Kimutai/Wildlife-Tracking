package module;

import org.sql2o.Connection;


public class Wildlife {
    public String name;
    public int id;
    public String health;
    public String age;
    public String type;

    //get methods
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getHealth(){
        return health;
    }
    public String getAge(){
        return age;
    }
    public String getType(){
        return type;
    }

}
