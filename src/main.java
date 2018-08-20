import java.util.ArrayList;

public class main {
    public static volatile ArrayList<Electronics> data = new ArrayList<Electronics>();
    public static void main(String[] args) {
        // добавляем нужное количество девайсов в зависимости от передаваемых параметров (args[0] - количество девайсов, args[1] - тип девайса)
       /* if (Integer.parseInt(args[0]) > 0 && args[1].equals("Phone")) {
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                data.add(new Phone());
            }
        }else if (Integer.parseInt(args[0]) > 0 && args[1].equals("SmartPhone")){
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                data.add(new SmartPhone());
            }
        }
        else if (Integer.parseInt(args[0]) > 0 && args[1].equals("Tablet")){
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                data.add(new Tablet());
            }
        }


        // добавляем нужное количество девайсов в зависимости от передаваемых параметров (args[2] - количество девайсов, args[3] - тип девайса)
        if (Integer.parseInt(args[2]) > 0 && args[3].equals("Phone")) {
            for (int i = 0; i < Integer.parseInt(args[2]); i++) {
                data.add(new Phone());
            }
        }else if (Integer.parseInt(args[2]) > 0 && args[3].equals("SmartPhone")){
            for (int i = 0; i < Integer.parseInt(args[2]); i++) {
                data.add(new SmartPhone());
            }
        }
        else if (Integer.parseInt(args[2]) > 0 && args[3].equals("Tablet")){
            for (int i = 0; i < Integer.parseInt(args[2]); i++) {
                data.add(new Tablet());
            }
        }

        // добавляем нужное количество девайсов в зависимости от передаваемых параметров (args[4] - количество девайсов, args[5] - тип девайса)
        if (Integer.parseInt(args[4]) > 0 && args[5].equals("Phone")) {
            for (int i = 0; i < Integer.parseInt(args[4]); i++) {
                data.add(new Phone());
            }
        }else if (Integer.parseInt(args[4]) > 0 && args[5].equals("SmartPhone")){
            for (int i = 0; i < Integer.parseInt(args[4]); i++) {
                data.add(new SmartPhone());
            }
        }
        else if (Integer.parseInt(args[4]) > 0 && args[5].equals("Tablet")){
            for (int i = 0; i < Integer.parseInt(args[4]); i++) {
                data.add(new Tablet());
            }
        }
        System.out.println("При запуске программы было создано: " + Electronics.objCounter + " объектов");*/







        /*data.add(new Phone());
        data.add(new SmartPhone());
        data.add(new Tablet());
        data.get(0).create();
        data.get(1).create();
        data.get(0).read();
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
