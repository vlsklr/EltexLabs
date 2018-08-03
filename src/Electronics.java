import java.util.UUID;

public abstract class Electronics implements ICrudAction{
    static int objCounter;

    UUID idofObject;// = UUID.randomUUID();
    String name;
    Double price;
    String manufacturer;
    String model;
    String operationSystem;
    public Electronics(){
        idofObject = UUID.randomUUID();
        this.name = "Default";
        this.price = 999.99d;
        this.manufacturer = "Default";
        this.model = "Default";
        this.operationSystem = "Any";
    }
    public Electronics(String name, Double price, String manufacturer, String model, String operationSystem){
        idofObject = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.operationSystem = operationSystem;
    }


}
