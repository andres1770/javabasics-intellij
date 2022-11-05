package class26;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArraylistVSLinkedlist {
    public static void main(String[] args) {

        LinkedList<String> linkedlist=new LinkedList<>();
        long startTime =System.currentTimeMillis();
        for(int i =0;i<1000000;i++){
            linkedlist.add(0,"test");
        }

        long endTime =System.currentTimeMillis();

        System.out.println("linked list"+ (endTime-startTime));


        ArrayList<String> arraylist=new ArrayList<>();
        long startTimea =System.currentTimeMillis();
        for(int i =0;i<1000000;i++){
            arraylist.add(0,"test");
        }

        long endTimea =System.currentTimeMillis();
        System.out.println("arraylist"+(endTimea-startTimea));



    }
}
