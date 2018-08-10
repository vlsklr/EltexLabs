import java.util.Random;

public class Phone extends  Electronics {
    String typeOfBody;
    //Phone phh;
    public Phone(String name, Double price, String manufacturer, String model, String operationSystem, String typeOfBody) {
        super(name, price, manufacturer, model, operationSystem);
        this.typeOfBody = typeOfBody;
    }

    public Phone() {
        super();
        this.typeOfBody = "default";
    }

    @Override
    // заполнение объекта случайными величинами
    public Phone create() {
        Random rnd = new Random();
        Electronics.objCounter++;
       return new Phone(String.valueOf(rnd.nextInt()),rnd.nextDouble(),String.valueOf(rnd.nextInt()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextInt()));

    }

    @Override
    //Обновление данных объекта, вызвавшего метод, в зависимости от переданных параметров.
    public  void update(String name, Double price,String manufacturer, String model, String operationSystem, String typeOfBody)
    {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.typeOfBody = typeOfBody;
    }

    @Override
    //печать всех сведений об объекте, от которого вызывается метод.
    public void read() {
        System.out.println("ID: "+ this.idofObject +  " Тип корпуса: " + this.typeOfBody+ " Фирма: " + this.manufacturer + " Название: "+ this.name + " Цена: " +this.price +" ОС: " +this.operationSystem +" Модель: " + this.model );

    }

    @Override
    //обнуляем все поля для объекта, от имени котого вызван метод.
    public  void delete() {
        this.name = null;
        this.price = null;
        this.operationSystem = null;
        this.typeOfBody = null;
        this.manufacturer = null;
        this.model = null;

    }
}
