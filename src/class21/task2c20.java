package class21;

public class task2c20{
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle. Test your code
     */
    public static void main(String[] args) {
        Circle circle=new Circle(6);
        circle.calculateArea();
    }
}
class Shape{

    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}
class Circle extends Shape{

    Circle(double radius) {
        super(radius);
    }
    void calculateArea(){
        System.out.println(Math.PI*Math.pow(radius,2));
    }
}