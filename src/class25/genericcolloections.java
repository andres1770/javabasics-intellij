package class25;

import java.util.ArrayList;

public class genericcolloections {
    public static void main(String[] args) {

//      this is a non generic way of using collections framework
        //it causes a lot of problems atr runtime
        ArrayList names=new ArrayList();
        names.add("sheri");
        names.add(10);
        System.out.println(names);

        System.out.println(((String)names.get(0)).length());


    }
}
