import java.util.Random;

public class Tablet extends Electronics {
    public String displaySize;
    public String graphCore;
    public Tablet() {
        super();
        this.displaySize = "Default";
        this.graphCore = "Default";
    }

    public Tablet(String name, Double price, String manufacturer, String model, String operationSystem, String displaySize, String graphCore) {
        super(name, price, manufacturer, model, operationSystem);
        this.graphCore = graphCore;
        this.displaySize = displaySize;
    }

    @Override
    public void delete() {
        super.delete();
        this.displaySize = null;
        this.graphCore = null;

    }

    @Override
    public void read() {
        super.read();
        System.out.println("Разрешение экрана: " + this.displaySize + "\nВидеоядро: " + this.graphCore);
    }

    public void update(String name, Double price, String manufacturer, String model, String operationSystem, String displaySize, String graphCore) {
        super.update(name, price, manufacturer, model, operationSystem);
        this.graphCore = graphCore;
        this.displaySize = displaySize;
    }

    @Override
    public void create() {
        Random rnd = new Random();
        Electronics.objCounter++;
        //return new Tablet(String.valueOf(rnd.nextInt()),rnd.nextDouble(),String.valueOf(rnd.nextInt()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextDouble()),String.valueOf(rnd.nextInt()),String.valueOf(rnd.nextInt()));
    }
}
