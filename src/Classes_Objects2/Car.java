package Classes_Objects2;

public class Car {
    private int year;
    private String make;
    private String model;
    private int doors;


    Car(int Year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
        this.doors = 4;

    }
    Car(int Year, String make, String model, int doors){
        this.year = year;
        this.make = make;
        this.model = model;
        this.doors = doors;

    }
}
