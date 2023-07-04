package Classes_Objects1;

public class Car {

    private String manufacturer;
    private int price;
    private EngineType engine;

    public Car(String manufacturer,int price,EngineType engine){
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.price = price;
    }

    public Car(String manufacturer,int price){
        this.manufacturer = manufacturer;
        this.price = price;
        this.engine = EngineType.Straight;
    }

    public Car(String manufacturer){
        this.manufacturer = manufacturer;
        this.price = 35000;
        this.engine = EngineType.Straight;

    }


    public Car(String manufacturer,EngineType engine){
        this.manufacturer = manufacturer;
        this.engine = engine;

       switch(this.engine){
           case Straight : this.price = 35000;
           break;
           case Diesel: this.price = 50000;
           break;
           case V: this.price = 78000;
           break;
           default: this.price = 35000;
       }
    }

    public String getManufacturer(){
      return manufacturer;
    }

    public int getPrice(){
      return price;
    }

    public EngineType getEngine(){
      return engine;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setEngine(EngineType engine){
        this.engine = engine;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){
        System.out.println("Hello");
        return String.format("{ Manufacturer: %s, Price: %d, Engine: %s }",getManufacturer(),getPrice(),getEngine());
    }
}
