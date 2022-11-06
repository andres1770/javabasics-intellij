package class27;

import java.util.LinkedHashMap;

public class MapDemo2 {

    public static void main(String[] args) {

        LinkedHashMap<String,Double> beautyproducts=new LinkedHashMap<>();
        beautyproducts.put("foundation",50.5);
        beautyproducts.put("Blush",20.0);
        beautyproducts.put("LipStick",10.5);

        LinkedHashMap<String, Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",10.2);
        cosmetics.put("conditioner",20.5);
        cosmetics.put("shampoo",30.99);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyproducts);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        grocery.remove(beautyproducts);
        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);
        //removeAll method does not work we cant remove all entries from a map

    }
}
