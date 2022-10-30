package class19;

public class task1 {
    /*

    Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.

     */

    public static void main(String[] args) {
        Student josh =new Student("josh","Earth");
        josh.displayinfo();
    }

}
class Student{
    String name;
    String address;
    public Student(String name,String address){
        this.name=name;
        this.address=address;
    }
    void displayinfo(){
        System.out.println("Name "+name+" Address "+address);
    }



}