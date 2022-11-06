package class27;

import java.util.ArrayList;

public class arrayListDemo {
    public static void main(String[] args) {


        ArrayList<Dog> dogs=new ArrayList<>();
        dogs.add(new Dog("Tomy","Black","German"));
        dogs.add(new Dog("Jony","White","BullDog"));
        dogs.add(new Dog("Kimi","Brown","German"));

        System.out.println(dogs);

    }
}

