package HomeWork;

public class Teacher {
    String feature1;
    String behaviour;
    String behaviour2;
    Teacher(String feature1,String behaviour,String behaviour2){
    this.feature1=feature1;
    this.behaviour=behaviour;
    this.behaviour2=behaviour2;
}
void printInfo(){
    System.out.println("feature "+feature1+" behaviour #1 "+behaviour+" behaviour #2 "+behaviour2);
}
}
class  MathTeacher extends Teacher{

    MathTeacher(String feature1, String behaviour, String behaviour2) {
        super(feature1, behaviour, behaviour2);
    }
}
class ChemistryTeacher extends Teacher{

    ChemistryTeacher(String feature1, String behaviour, String behaviour2) {
        super(feature1, behaviour, behaviour2);
    }
}
class PianoTeacher extends Teacher{

    PianoTeacher(String feature1, String behaviour, String behaviour2) {
        super(feature1, behaviour, behaviour2);
    }
}
class Test {
    public static void main(String[] args) {


        MathTeacher newteacher1 = new MathTeacher("smart", "gives homework", "fail students");
        newteacher1.printInfo();
        ChemistryTeacher newteacher2 = new ChemistryTeacher("likes chemistry", "likes to mix components ", "wears a lab coat ");
        newteacher2.printInfo();
        PianoTeacher newteacher3 = new PianoTeacher("plays piano", "loves music", "makes songs ");
        newteacher3.printInfo();

    }
}
