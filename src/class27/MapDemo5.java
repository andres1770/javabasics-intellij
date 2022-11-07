package class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {


        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// store values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);


     //   Collection<Double> values=fruit.values();//returns all the values from a map
      //  Iterator<Double> it= values.iterator();
      //  while(it.hasNext()){
       //     double price=it.next();
       //     if(price>2.00){
        //        it.remove();


       // System.out.println(values);
        fruit.values().removeIf(x->x>2);// same results ass code from line 18-25
        System.out.println(fruit);

    }
}