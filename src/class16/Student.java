package class16;

public class Student {
    String name;
    String id;
     static int noOfStudent;
    public static void main(String[] args) {



        Student roman = new Student();
        roman.id="1";
        roman.name="Ivan";
        Student.noOfStudent++;

        Student sonam=new Student();
        sonam.id="2";
        sonam.name="sonam";
        Student.noOfStudent++;

        System.out.println(Student.noOfStudent);
        System.out.println(Student.noOfStudent);
    }
}