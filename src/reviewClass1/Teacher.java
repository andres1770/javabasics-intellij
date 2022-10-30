package reviewClass1;

public class Teacher {
    String name ,lastname;
    int experience;
    String subject;
    double salary;
    static String school;
    // how to create a constructor
    //1. constructor name=classname
    //2.no return type not even void

    //using below constructor we initialize instance variables
    Teacher(String fname,String lname) {
        name = fname;
        lastname = lname;
    }
        //when you create a constructor
        //compiler will not create one for you
        void print() {
            System.out.println(name+" "+lastname);
        }
    }

