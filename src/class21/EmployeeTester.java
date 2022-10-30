package class21;

public class EmployeeTester {
    public static void main(String[] args) {
        officeBoy ob=new officeBoy();
        ob.calculateSalary();

        Testers tester=new Testers();
        tester.calculateSalary();

        Developer developer=new Developer();
        developer.calculateSalary();
    }
}
