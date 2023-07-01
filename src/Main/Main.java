package Main;

import Classes_Objects1.Car;
import Classes_Objects1.EngineType;

public class Main {


    public static void main(String[] args){
        Car Toyota = new Car("Toyota", 30000);
        Toyota.setEngine(EngineType.Type3);
        System.out.println(Toyota.getEngine());
        Toyota.toString();
    }

}
