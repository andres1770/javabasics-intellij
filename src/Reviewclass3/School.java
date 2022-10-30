package Reviewclass3;

public class School {
    public static void main(String[] args) {
        Teacher t=new Teacher("jhon","Smith");
        System.out.println(t.name);

        Teacher t1=new Teacher("jane","smith","biology");
        t1.teach();
        Teacher t2=new Teacher("janelle","smith",5);
        Teacher.school="Syntax";
        Teacher.work();
    }
}
