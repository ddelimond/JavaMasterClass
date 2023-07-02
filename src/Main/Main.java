package Main;

import Classes_Objects1.Car;
import Classes_Objects1.CarDealership;
import Classes_Objects1.EngineType;

import java.util.ArrayList;

public class Main {

    static CarDealership practice = new CarDealership("Darren's Cars");



    public static void main(String[] args){
         Car first = new Car("Honda");
         Car second = new Car("Toyota");
         Car third = new Car("Nissan");

        practice.addCarToDealership(first);
        practice.addCarToDealership(second);
        practice.addCarToDealership(third);
        System.out.println(practice.toString());
    }

}
