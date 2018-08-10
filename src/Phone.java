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
    public Phone create() {
        Random rnd = new Random();
        Electronics.objCounter++;
       return new Phone(String.valueOf(rnd.nextInt()),rnd.nextDouble(),String.valueOf(rnd.nextInt()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextInt()));

    }

    @Override
    public  void update()
    {

    }

    @Override
    public void read() {
        System.out.println(this.typeOfBody+" " + this.manufacturer + " "+ this.typeOfBody );

    }

    @Override
    public  void delete() {

    }
}
