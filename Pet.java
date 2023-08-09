public class Pet {
    private String Name;
    private int Age;
    private String Location;
    private String Type;

    //Constructor no arguments
    public Pet() {
        Name = "Techie";
        Type = "Half-breed";

    }

    //Constructor all arguments
    public Pet(String name, int age, String location, String type) {
        this.Name = name;
        this.Age = age;
        this.Location = location;
        this.Type = type;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getType() {
        return Type;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public void setLocation(String location) {
        this.Location = location;
    }
}







/*1. Create a Pet Class with the following instance variables:
        name (PRIVATE)
        age (PRIVATE)
        location (PRIVATE)
        type (PRIVATE)
        two constructors(empty, all attributes)
        Code to be able to access the following (Get Methods):
        name, age, type
        Code to be able to change (Set Methods):
        name, age, location
