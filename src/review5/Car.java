package review5;
// with the help of abstract class we can achive 0 to 100 percent abstraction


    interface Drivable {
        //by default inside interfaces all variables are public static finial
        boolean DRIVES=true;
        //WE CAN NOT HAVE A CONSTRUCTOR
        // BY DEFAULT ALL METHODS ARE PUBLIC  ABSTRACT
        void breaks();
    }
    interface vehicle{
        void havemotor();

        //from java 8 we can have static method and default methods
        default void haveBreak(){
            System.out.println("All vehicle have break");
        }
        static void honk(){
            System.out.println("all vehicles honk");
        }
    }
    public abstract class Car {
        String color,make,model;
public static final int WHEELS=4;
    Car(String color,String make,String model){
        this.make=make;
        this.model=model;
        this.color=color;
    }
    void drive(){
        System.out.println("all cars can drive");
    }
    abstract void start();
    abstract void stop();

}
class Tesla extends Car implements Drivable , vehicle{

    Tesla(String color, String make, String model) {
        super(color, make, model);
    }

    @Override
    void start() {
        System.out.println(make+" Starts automatically ");
    }

    @Override
    void stop() {
        System.out.println(make+" stops when we press break");
    }
 public void charge (){
    System.out.println("need to charge ur tesla");
}

    @Override
    public void breaks() {
        System.out.println(make+" can break");
    }

    @Override
    public void havemotor() {

    }
}