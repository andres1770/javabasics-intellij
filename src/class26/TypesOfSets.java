package class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesOfSets {
    public static void main(String[] args) {
        //there are three types of sets
        /*
        Hashset: downside= it does not care about the intersection order
        upside= It is the fastest type of set

         */// when you need speed you should use hashset
        HashSet<String> hashset=new HashSet<>();
        hashset.add("Mango");
        hashset.add("Apple");
        hashset.add("Kiwi");
        hashset.add("Orange");
        hashset.add("Banana");
        System.out.println("hashSet");
        System.out.println(hashset);
// whenever you need insertion order
//       insertion speed is the same as hashSet but retriveal ios the worst
        LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
      linkedhashset.add("Mango");
      linkedhashset.add("Apple");
      linkedhashset.add("Kiwi");
      linkedhashset.add("Orange");
      linkedhashset.add("Banana");
        System.out.println("linkedHashSet");
        System.out.println(linkedhashset);

// whenever you need sorted data you should use tree set
        TreeSet<String> treeset=new TreeSet<>();
        treeset.add("Mango");
        treeset.add("Apple");
        treeset.add("Kiwi");
        treeset.add("Orange");
        treeset.add("Banana");
        System.out.println("TreeSet");
        System.out.println(treeset);


    }

}
