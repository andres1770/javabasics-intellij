package class24;

import java.util.ArrayList;

public class arraylistdemo1 {
    public static void main(String[] args) {

        // syntax to create arraylist
        ArrayList<String> colors=new ArrayList<>();
        // use add method to insert elements
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("black");
// prints all the elements
        System.out.println(colors);
        // use get method to print individual elements from arraylist
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        // gives you the size of the arraylist
        System.out.println(colors.size());
//getting all the elements through normal loop
        for (int i =0;i< colors.size() ;i++){
            System.out.println(colors.get(i));
        }
        System.out.println("*********************************");
        //gettin all the elements from enhanced loop
        for (String color:colors){
            System.out.println(color);
        }
    }
}
