package Classes_Objects2;

import java.util.Objects;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && doors == car.doors && Objects.equals(make, car.make) && Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "year:" + year +
                ", make:'" + make + '\'' +
                ", model;'" + model + '\'' +
                ", doors:" + doors +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, make, model, doors);
    }
}
