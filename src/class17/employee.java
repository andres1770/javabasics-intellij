package class17;



public class employee {
   private String name;
  private  String department;
  private   double salary;
  private   String id;
  private   int age;
   private double actualsalary;
   static String companyName="Syntax";

   public employee (String empName,String empDepart,double empSalary,int empAge){
    name=empName;
    department=empDepart;
    salary=empSalary;
    age=empAge;
}

   void printSalary() {
       double actualSalary = salary + 20000 + 10000;
       System.out.println(actualSalary);
   }
   void calculatePrintTax(){
       double tax=actualsalary*.3;
       System.out.println("tax"+tax);
   }






    }

