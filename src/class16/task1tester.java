package class16;

public class task1tester {

    public static void main(String[] args) {
        SyntaxEmployee syntaxemp=new SyntaxEmployee();
        syntaxemp.empId="123";
        syntaxemp.salary=100000;


        SyntaxEmployee.CEO="Asel";
        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee moazzamemp= new SyntaxEmployee();
        moazzamemp.empId="123";
        moazzamemp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);
    }


}
