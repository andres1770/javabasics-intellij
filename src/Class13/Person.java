package Class13;

import com.sun.tools.javac.Main;

import javax.imageio.stream.ImageInputStream;

public class Person {
    static String action1;
  static Boolean canwalk;


    Person(String action1, String canwalk) {
        this.action1 = action1;
        this.canwalk = Boolean.valueOf(canwalk);

    }

    public Person(String action1, Boolean canWalk) {
    }

    static void prinF(){



        System.out.println("action " +action1+" can walk "+canwalk);
    }
}
    class ClassB extends Person{

        ClassB(String action1, Boolean canwalk) {
            super(action1, canwalk);

        }
        public static void main(String[] args) {
            Person obj=new Person("runs",true);
            obj.prinF();
        }
    }
    class ClassC extends ClassB{

        ClassC(String action1, Boolean canWalk) {
            super(action1, canWalk);
        }
    }

