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
        this.engine = EngineType.Type3;
    }

    public Car(String manufacturer){
        this.manufacturer = manufacturer;
        this.price = 0;
        this.engine = EngineType.Type2;

    }

    public Car(int price){
        this.manufacturer = "Toyota";
        this.engine = EngineType.Type1;
        this.price = price;
    }

    public Car(int price,EngineType engine){
        this.manufacturer = "Toyota";
        this.engine = engine;
        this.price = price;
    }

    public Car(EngineType engine){
        this.manufacturer = "Toyota";
        this.engine = engine;
        this.price = 0;
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
        System.out.printf("{%s,%d,%s}",getManufacturer(),getPrice(),getEngine());
        return null;
    }



}
