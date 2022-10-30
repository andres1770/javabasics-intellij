package class22;

public class task1 {

}
class Degree{
    void getprerequisite(){
        System.out.println("to get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
class Masters extends Degree{
    @Override
    void getprerequisite(){
        System.out.println("to get a masters degree you need a bachelors degree");
    }
}