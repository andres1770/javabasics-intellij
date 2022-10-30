package class22;

public class Car {
    void start(){
        System.out.println("use the key to start me ");
    }
    void stop(){
        System.out.println("use brakes to stop me");
    }
    void park(){
        System.out.println("park me manually");
    }

}
class BMW extends Car{
    void start(){
        System.out.println("use push start to start me ");
    }
    void stop(){
        super.stop();
        System.out.println("you can also use auto braking to stop me ");
    }
}

class Toyota extends Car{
    void start(){
        System.out.println("push me to start");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("use the app to start me ");
    }
    void stop(){
        System.out.println("use AI and autobreaking to stop me ");
    }
    void park(){
        System.out.println("i can autopark myself");
    }
}