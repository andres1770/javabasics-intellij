package hw;

import java.util.ArrayList;

public abstract class insurance {

    String insuranceName;
insurance(String insuranceName){
    this.insuranceName=insuranceName;
}
   abstract  void getQuote();

abstract void cancelInsurance();

}
class Car extends insurance {
    String carModel;

    Car(String insuranceName,String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println("this is "+carModel+" quote will  $275");
    }

    @Override
    void cancelInsurance() {
        System.out.println("this is "+carModel+" cancel method");
    }
}
class Pet extends insurance{
String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println("this is "+petType+" quote will be $475");
    }

    @Override
    void cancelInsurance() {
        System.out.println("this is "+petType+" cancel method");
    }
}
class Health extends insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println("this is "+insuranceName+" quote will be $925");
    }

    @Override
    void cancelInsurance() {
        System.out.println("this is "+insuranceName+" cancel method");
    }
}
class set{
    public static void main(String[] args) {
        ArrayList<insurance> insurances= new ArrayList<>();
        insurances.add(new Car("expensive insurance","Alfa romeo"));
        insurances.add(new Pet("expensive insurance","dog"));
        insurances.add(new Health("expensive insurance"));

        for(insurance test:insurances){
            test.getQuote();
            test.cancelInsurance();

        }

    }
}
