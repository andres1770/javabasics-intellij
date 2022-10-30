package Class13;

 public class Employee{
    String name;
    String lastname;
    int employeeid;
    String startdate;
    int salary;
    Employee(){

    }
    Employee(String name,String lastname,int employeeid,String startdate,int salary){
        this.name=name;
        this.lastname=lastname;
        this.employeeid=employeeid;
        this.startdate=startdate;
        this.salary=salary;
    }
    void display(){
        System.out.println(name+lastname+employeeid+startdate+salary);
    }
    public static void main(String[] args){
    Employee emp=new Employee();
    emp.display();
    Employee emp1=new   Employee("joe","Smith",12345,"01/01/1970",35000);
    emp1.display();
}
}

