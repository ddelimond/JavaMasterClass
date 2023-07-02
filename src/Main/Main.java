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
         Car fourth= new Car("HellCat", EngineType.V);
         Car fifth = new Car("Ford",EngineType.V);
         Car sixth = new Car("Toyota",45000,EngineType.Straight);


        practice.addCarToDealership(first);
        practice.addCarToDealership(second);
        practice.addCarToDealership(third);
        practice.addCarToDealership(fourth);
        practice.addCarToDealership(fifth);
        practice.addCarToDealership(sixth);
        System.out.println(practice.toString());
        System.out.println(practice.findCarByManufacturer("Toyota"));
    }

}
