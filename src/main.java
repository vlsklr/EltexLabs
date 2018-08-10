import java.util.ArrayList;

public class main {
    public static volatile ArrayList<Electronics> data = new ArrayList<Electronics>();
    public static void main(String[] args) {

        Phone ph = new Phone().create();
        Electronics e= new Phone().create();
        data.add(e);
        data.add(ph);
        data.get(0).read();

      //   ph = ph.create();
      // Phone ph2= (Phone) ph.create();
     //   System.out.println(Electronics.objCounter);
        System.out.println(Electronics.objCounter);
        System.out.println(ph);
        System.out.println();

    }
}
