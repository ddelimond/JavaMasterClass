package Classes_Objects1;

import java.util.ArrayList;

public class CarDealership {
    private String name;
    private int maxCarsOnDisplay;
    private ArrayList carsInStock;

    public CarDealership(String name){
         this.name = name;
         this.maxCarsOnDisplay = 0;
         this.carsInStock = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getMaxCarsOnDisplay(){
        return this.maxCarsOnDisplay;
    }

    public ArrayList getCarsInStock(){
        return this.carsInStock;
    }

    public void setMaxCarsOnDisplay(int max){
        this.maxCarsOnDisplay = max;
    }

    public int getNumberOfCars(){
        return getCarsInStock().size();
    }

    public void addCarToDealership(Object car){
     this.carsInStock.add(car);
    }


    public Object findCarByManufacturer(String property){
        Object result = null;
       for(Object car :this.carsInStock.toArray()){
           if(car.toString().contains(property)) {
                result = car;
                break;
           }
       }

        return result;
    }

    @Override
    public String toString(){
        return String.format("{\n name: %s,\n maxDisplayCars: %d,\n carsInStock: %s,\n}",this.name, this.maxCarsOnDisplay, this.carsInStock.toString());
    }
}
