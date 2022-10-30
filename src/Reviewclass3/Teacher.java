package Reviewclass3;

public class Teacher {
    String name , lname;
    String subject;
    int experience;
    double salary;

    static String school;
    Teacher(String name ,String lname){
      this.name=name;
      this.lname=lname;
    }
    Teacher(String name ,String lname,String subject) {
        this(name, lname);
        this.subject=subject;
    }
    Teacher(String name ,String lname, int experience){
        this(name, lname);
        this.experience=experience;
    }
    static void work(){
        System.out.println("All teachers work at "+school);
    }
    void print(){
        work();
        System.out.println("Teacher name is "+name+" "+lname);
    }
    void teach(){
        this.print();
        System.out.println(name+" "+"teaches "+subject);
    }
    double getBonus(){
        if(experience<5){
            return 3;
        }else {
            return 3.5;
        }
    }
    }

