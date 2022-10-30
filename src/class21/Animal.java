package class21;

public class Animal {
    String name;
    String color;
    String breed;
    void Sleep(){
        System.out.println(" Animals usually sleep for 6 hours");
    }
    void eat(){

        System.out.println(" Grass and meat");
    }
}
class Cat extends Animal{
    void Sleep(){
        System.out.println(" Cats sleep for 20 hours");
    }
    void eat(){
        System.out.println("i only like fish");
    }
}
class Dog extends Animal{
    void Sleep(){
        System.out.println("Dogs sleep for 10 hours");
    }
    void eat(){
        System.out.println("i like meat");
    }
}