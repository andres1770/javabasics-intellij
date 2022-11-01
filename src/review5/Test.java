package review5;

public class Test {
    public static void main(String[] args) {
        Car car=new Tesla("black","tesla","X");

       car.drive();
       car.start();
       car.stop();

        Tesla tesla =new Tesla("yellow","tesla","X");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
    }
}
