package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class whyCollectionsFramework {
    public static void main(String[] args) {
        //if we have to store a single value we should use variables
        String name="josh";
        String name2= "mani";
        System.out.println(name);
        System.out.println(name2);
        /*
        if we have to store more than 2 values of same kind
         */
        String[] names={"josh","andres","adam"};
        /*
        fixed in size
         */
        String[] breeds=new String[10];
        breeds[0]="bulldogs";
        System.out.println(Arrays.toString(breeds));


        ArrayList<String> colors=new ArrayList<>();
        colors.add("black");
        colors.add("red");
        System.out.println(colors);

    }
}
