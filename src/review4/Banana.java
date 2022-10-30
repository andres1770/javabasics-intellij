package review4;

public class Banana extends Fruit{
    String origin;
    Banana(String name, String shape, String color,String origin) {
        super(name, shape, color);
        this.origin=origin;
    }
    void makeSmoothie(){
        System.out.println("from "+name+" we get tasty smoothie");
    }
    /*
    how to iplement overriding
    1.method signature must be the same
    we care about return type it must be same
    access modifier should always be the same or have more visibility
     */
    @Override
    public void grow(){
        System.out.println(name+" grows fast and fresh ");
    }
    public static void havePeel(){
        System.out.println("banana is very easy to peel ");
    }
    void makePie(){
        System.out.println("banana pie is delicious ");
    }
    public static void main(String[] args) {
        Banana ban=new Banana("banana","banana shape","yellow","Ecuador");

   ban.haveBenefits();// from fruit class
   ban.makeSmoothie();// from banana class
   ban.grow();// banana
        Banana.havePeel();//banana
        System.out.println("__-------------------");
     Fruit fruit=new Banana("banana","banana shape","green","africa");
   fruit.grow();//runtime polymorphism is achieved by method overriding
   fruit.haveBenefits();
   fruit.havePeel();
    }
}
