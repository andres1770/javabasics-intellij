package hw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class deleteDuplicates {
    public static void main(String[] args) {
        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        var hashset=new HashSet<>(aList);
        System.out.println(hashset);

        var linkedlist=new LinkedList<>(hashset);
        System.out.println(linkedlist);
    }
}
