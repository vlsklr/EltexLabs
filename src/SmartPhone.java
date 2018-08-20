import java.util.Random;

public class SmartPhone extends  Electronics{
    public String typeOfSIM;
    public int countOfSIM;
    public SmartPhone() {
                super();
                this.typeOfSIM = "micro";
                this.countOfSIM = 0;
    }

    public SmartPhone(String name, Double price, String manufacturer, String model, String operationSystem, String typeOfSIM, int countOfSIM) {
        super(name, price, manufacturer, model, operationSystem);
        this.typeOfSIM = typeOfSIM;
        this.countOfSIM = countOfSIM;
    }

    @Override
    public void delete() {
        super.delete();
        this.countOfSIM = 0;
        this.typeOfSIM = null;
    }

    @Override
    public void read() {
        super.read();
        System.out.println("Тип симкарты: " + this.typeOfSIM + "\nКоличество симкарт: " + this.countOfSIM);
    }


    public void update(String name, Double price, String manufacturer, String model, String operationSystem, String typeOfSIM, int countOfSIM) {
        super.update(name, price, manufacturer, model, operationSystem);
        this.countOfSIM = countOfSIM;
        this.typeOfSIM = typeOfSIM;

    }

    @Override
    public void create() {
        Random rnd = new Random();
        Electronics.objCounter++;
       // return new SmartPhone(String.valueOf(rnd.nextInt()),rnd.nextDouble(),String.valueOf(rnd.nextInt()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextInt()),rnd.nextInt());
    }
}
