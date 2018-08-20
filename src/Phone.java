import java.util.Random;

public class Phone extends  Electronics {
    String typeOfBody;

    public Phone(String name, Double price, String manufacturer, String model, String operationSystem, String typeOfBody) {
        super(name, price, manufacturer, model, operationSystem);
        this.typeOfBody = typeOfBody;
    }

    public Phone() {
        super();
        this.typeOfBody = "default";
    }



    @Override
    public void create() {
        super.create();
        Random rnd = new Random();
        this.typeOfBody = String.valueOf(rnd.nextInt());
      //  Electronics.objCounter++;

        //return new Phone(String.valueOf(rnd.nextInt()),rnd.nextDouble(),String.valueOf(rnd.nextInt()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextInt()));

    }


    public void update(String name, Double price, String manufacturer, String model, String operationSystem, String typeOfBody) {
        super.update(name, price, manufacturer, model, operationSystem);
        this.typeOfBody = typeOfBody;
    }

    @Override
    public void delete() {
        super.delete();
        this.typeOfBody = null;
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Тип корпуса: " + this.typeOfBody);
    }


}
