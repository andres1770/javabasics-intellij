package class18;
public class Car{
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    void printcardetails(){
        System.out.println(" model "+model+" make "+make+" color "+color);
    }
}
class BMW extends Car{
    double enginecc;

}

class Tesla extends Car{

}
class Toyota extends Car{
    double enginecc;

}
class carTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="M8";
        bmw.enginecc=1000;
        bmw.printcardetails();


    }


    }
