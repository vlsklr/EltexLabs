public interface ICrudAction {
      void   create();
      void update(String name, Double price,String manufacturer, String model, String operationSystem);
     void read();
     void delete();

}
