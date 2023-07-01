package Classes_Objects1;

import java.util.ArrayList;

public class CarDealership {
    private String name;
    private int maxCarsOnDisplay;
    private ArrayList carsInStock;

    CarDealership(String name, int max, ArrayList inStock){
         this.name = name;
         this.maxCarsOnDisplay = max;
         this.carsInStock = inStock;
    }

    CarDealership(String name, ArrayList inStock){
        this.name = name;
        this.maxCarsOnDisplay = inStock.size()/2;
        this.carsInStock = inStock;
    }


    CarDealership(String name, int max){
        this.name = name;
        this.maxCarsOnDisplay = max;
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

    public void setName(String name){
        this.name = name;
    }
    public void setMaxCarsOnDisplay(int max){
        this.maxCarsOnDisplay = max;
    }
    public void setCarsInStock(ArrayList stock){
        this.carsInStock = stock;
    }
}
