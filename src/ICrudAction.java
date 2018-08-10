public interface ICrudAction {
      Electronics  create();
      void update(String name, Double price,String manufacturer, String model, String operationSystem, String typeOfBody);
     void read();
     void delete();

}
