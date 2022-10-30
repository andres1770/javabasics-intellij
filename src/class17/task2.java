package class17;

public class task2 {
    /*
    Create a method that will take a String as a parameter and returns reversed String
     Method should be available to all classes within your project and accessible by class name.
     */
public static String reversestr(String str){
   return new StringBuilder(str).reverse().toString();
}

    public static void main(String[] args) {

        System.out.println(task2.reversestr("sunday"));
    }
}
