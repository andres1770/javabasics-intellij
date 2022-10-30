package class21;

public class Parent {
    void getMarry(){
        System.out.println("you will marry the girl that we will select for you ");
    }
}
class Zam extends Parent{

    void getMarry(){
        System.out.println("i want to marry taylor swift");
    }
}
class test{
    public static void main(String[] args) {
        Zam zam=new Zam();
        zam.getMarry();
    }
}