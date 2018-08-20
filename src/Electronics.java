import java.util.Random;
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



    @Override
    //обнуляем все поля для объекта, от имени котого вызван метод.
    public  void delete() {
        this.name = null;
        this.price = null;
        this.operationSystem = null;
        this.manufacturer = null;
        this.model = null;

    }
    @Override
    //печать всех сведений об объекте, от которого вызывается метод.
    public void read() {
        System.out.println("ID: "+ this.idofObject +  "\nФирма: " + this.manufacturer + "\nНазвание: "+ this.name + "\nЦена: " +this.price +"\nОС: " +this.operationSystem +"\nМодель: " + this.model );

    }
    @Override
    //Обновление данных объекта, вызвавшего метод, в зависимости от переданных параметров.
    public  void update(String name, Double price,String manufacturer, String model, String operationSystem)
    {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.operationSystem = operationSystem;

    }

    @Override
    public void create() {
        Random rnd = new Random();
        Electronics.objCounter++;
        this.operationSystem = String.valueOf(rnd.nextInt());
        this.model = String.valueOf(rnd.nextInt());
        this.model = String.valueOf(rnd.nextInt());
        this.manufacturer = String.valueOf(rnd.nextInt());
        this.price = rnd.nextDouble();

    }
}
