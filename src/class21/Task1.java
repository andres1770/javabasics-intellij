package class21;

public class Task1 {
    /*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
      Rectangle, Square, Box
      Use separate class to test your code
     */
    public static void main(String[] args) {
        AreaManager Am=new AreaManager();
        Am.calculateArea(10);
        Am.calculateArea(10,12);
        Am.calculateVolume(20,30,10);
    }
}
class AreaManager{

    void calculateArea(double len,double wid){
        System.out.println(len*wid);
    }
    void calculateArea(double len){
        System.out.println(len*len);
    }
    void calculateVolume(double len,double wid,double height){
        System.out.println(len*wid*height);
    }
}