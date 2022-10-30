package class24;

public class Dog {
   private String name;
   private String breed;
   private  int age;
   private double weight;

    Dog(String name,String breed,int age,double weight){
        setName(name);
       setBreed(breed);
       setAge(age);
        setWeight(weight);

    }
    void setWeight(double weight){
        if(weight>300){
            System.out.println("set a proper age ");
        }else if (weight<0){
            System.out.println("negative age is not allowed");
        }else {
            this.weight=weight;
        }
    }
    void setName(String name){
        if(name.length()>30){
            System.out.println("name cant be more than 30 characters");
        }else if(name.isEmpty()){
            System.out.println("name cant be empty please try again ");
        }else {
            this.name = name;
        }
    }
    void setAge(int age){
        if(age>20){
            System.out.println("your dog id broken please use proper age ");
        }else if (age<0){
            System.out.println("age cant not be negative");
        }else{
            this.age=age;
        }

    }
    void setBreed(String breed){
        if(breed.length()>20){
            System.out.println("breed cant be more than20 characters try again");
        }
        else if (breed.isEmpty()){
            System.out.println("breed cant be empty");
        }else{
            this.breed=breed;
        }
    }

    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getBreed(){
        return breed;
    }
    double getWeight(){
        return weight;
    }
    void printinfo(){
        System.out.println("name "+name+" breed "+breed+" age "+age+" weight "+weight);
    }
}class Test{
    public static void main(String[] args) {
        Dog tommy=new Dog("Tommy","german",15,20);
        tommy.printinfo();

    }
}
