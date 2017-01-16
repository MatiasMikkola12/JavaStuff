package JSON;

import java.io.Serializable;
import java.util.HashMap;

public class MatiasObjectTest implements Serializable {

    private String make;
    private String model;
    private String year;
    private String color;

    // hello
    public MatiasObjectTest(String make, String model, String year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

        // need "this." in order for the names to know to pull the values
    }

    public MatiasObjectTest(HashMap parsedMap) {
        make = (String) parsedMap.get("Make");
        model = (String) parsedMap.get("Model");
        year = (String) parsedMap.get("Year");
        color = (String) parsedMap.get("Color");

    }
}