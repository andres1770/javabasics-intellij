package reviewClass1;

public class Dog {

    String name;
    int weight;
    static String breed;

    void printinfo() {
        System.out.println("dog features: " + name + "," + weight + "," + breed);
    }
    void love(String thing){
        System.out.println(name+" loves "+thing);
    }

        // create a method to return price
        double getprice(){
            if(weight<5){
                return 100;
            }else if (weight<10){
                return 300;
            }else {
                return 1000;
            }
    }
    //create a method that will return bark type
    String barktype(){
        String noise;
        if(weight<5){
            noise="loud";
        }else if (weight<10){
            noise="woof";
        }else{
            noise="Gav Gav";
        }
        return noise;


    }
}

