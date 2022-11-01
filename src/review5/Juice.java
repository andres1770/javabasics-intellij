package review5;


 final class Drink{

    void drink(){
        System.out.println("drinking method");
    }
    //final methods can not be overriden
   protected final void enjoy (){
        System.out.println("we enjoy drinking water");
    }
}


//public class Juice extends Drink{

    /* CE: cannot override final method from drink
    @Override
   protected void enjoy(){
        System.out.println(" we enjoy drinking juice");
    }
    */
//}
