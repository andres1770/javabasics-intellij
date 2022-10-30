package class24;

import java.util.ArrayList;

public class arraylistdemo3 {
    public static void main(String[] args) {

        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('M');
        chars.add('L');
        chars.add('V');
        System.out.println(chars);

        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(true);
        booleans.add(false);
        System.out.println(booleans);

        ArrayList<Float> floats=new ArrayList<>();
        floats.add(51.4f);
        floats.add(65.7f);
        System.out.println(floats);

    }
}
