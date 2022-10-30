package class24;

import java.util.ArrayList;

public class arraylistdemo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("andres");
        names.add("josh");
        names.add("valeria");
        names.add("daniela");
        names.add(0 ,"manuela");
        names.set(3,"lani");
        System.out.println(names);

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(12);
        numbers.add(47);
        numbers.add(35);
        numbers.add(1,100);
        System.out.println(numbers);
    }
}
