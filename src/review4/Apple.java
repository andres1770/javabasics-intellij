package review4;

public class Apple extends Fruit{

String size;
String taste;
double price;

     Apple(String name, String shape, String color,String size) {

          super(name, shape, color);
          this.size=size;
    }
    Apple(String name, String shape, String color,String size,String taste,double price){
         this(name,shape,color,size);
         this.taste=taste;
         this.price=price;
    }
//overloading - methods with same name within same class
    /*how to achieve overloading:
    1. change number of parameters
    2.change type of parameters
    in overloading -method signature MUST BE DIFFERENT
    method signature = name parameters

     */
    void makeJuice(){
        System.out.println("from "+name+" we can make "+taste+" juice");
    }
    /*
    this is not overloading
    String makeJuice(){
    }

     */
    void makeJuice(String fruit){
        System.out.println("we can have juice from "+name+" mixed with "+fruit);
    }

    public static void main(String[] args) {
        Apple app=new Apple("apple","circle","red","big");
        //app.color; not visible since its access modifier is private
        System.out.println(app.name);
        System.out.println(app.shape);

        System.out.println(Fruit.fresh);
        System.out.println(Apple.fresh);

        app.grow();// from fruit class
        app.haveBenefits();// from fruit class
        app.makeJuice();// from Apple class
    }

}
