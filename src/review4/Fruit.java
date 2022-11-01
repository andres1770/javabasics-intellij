package review4;

public class Fruit {
   protected String name ;
    String shape;
  private  String color;
  final public static boolean FRESH=true;
final public static boolean CAN_EAT=true;


    public Fruit(String name){
        this.name=name;
    }
    Fruit(String name,String shape,String color){
        this(name);
        this.shape=shape;
        this.color=color;
    }
    void grow(){
        System.out.println("All fruits grow fresh ");
    }
   protected void haveBenefits(){
        System.out.println("All fruits are good for your health");
    }
    public static void havePeel(){
        System.out.println("all fruits need to be peeled ");
    }


}
