import java.util.ArrayList;

public class main {
    public static volatile ArrayList<Electronics> data = new ArrayList<Electronics>();
    public static void main(String[] args) {
        data.add(new Phone());
        data.add(new SmartPhone());
        data.add(new Tablet());
        data.get(0).create();
        //data.get(0).read();
     /*   data.get(1).read();
        data.get(2).read();*/


       /* Phone ph = (Phone) new Phone().create();
        Electronics e = new Phone().create();
        data.add(e);
        data.add(ph);
        data.get(0).update("iPhone", 777.77d, "Apple", "SE", "IOS","Block");
        data.get(0).read();

    //    data.get(0).delete();


      //   ph = ph.create();
      // Phone ph2= (Phone) ph.create();
     //   System.out.println(Electronics.objCounter);
      /*  System.out.println(Electronics.objCounter);
        System.out.println(ph);
        System.out.println();*/

    }
}
