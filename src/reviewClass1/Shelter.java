package reviewClass1;

public class Shelter {
    public static void main(String[] args) {
        Dog.breed="Pitbull";
        Dog dog1=new Dog();
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printinfo();
        System.out.println("------Making Changes-------");
        dog1.name="Boobik";
        dog1.breed="german";

        Dog dog2=new Dog();
        dog2.name="Tommy";
        dog2.weight=10;
        System.out.println(dog2.name);
        dog1.printinfo();
        dog2.printinfo();

        double price=dog1.getprice();
        System.out.println(price);

        double price2=dog2.getprice();
        System.out.println(price2);

        System.out.println(dog1.barktype());
        System.out.println(dog2.barktype());
        dog1.love("to jump");
        dog2.love("to play");
    }
}
