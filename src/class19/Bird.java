package class19;

public class Bird {
    String name;
    String color;
    int age;
    double weight;
    Bird(String name,String color,int age ,double weight ){
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void printinfo(){
        System.out.println("name "+name+" color "+color+" age "+age+" weight "+weight);
    }
}
class Parrot extends Bird{
    Parrot(String name,String color,int age ,double weight ){
        super(name,color,age ,weight);
       /* this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;*/
    }

}
class Sparrow extends Bird{
 Sparrow(String name,String color,int age ,double weight ){
     super(name,color,age ,weight);


}}
class Crow extends Bird{
    Crow(String name,String color,int age ,double weight ){
        super(name,color,age ,weight);
       /* this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;*/
    }}
class Test{
    public static void main(String[] args) {
        Parrot parrot =new Parrot("zeky","black",2,2);
        parrot.printinfo();

        Crow crow=new Crow("andres","blue",2,3);
        crow.printinfo();

        Sparrow sparrow =new Sparrow("carlos","white",4,6);
        sparrow.printinfo();
    }
}