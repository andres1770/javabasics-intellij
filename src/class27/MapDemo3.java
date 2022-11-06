package class27;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {


        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);// store values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);
        fruit.put("Banana", 10.1);
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));

        Set<String> keyset=fruit.keySet();//returns all the keys in the form of set
        System.out.println(keyset);

        var values=fruit.values();//returns all the values in the form of a collection
        System.out.println(values);


    }
}