package class17;

public class Dog {
    private String name;
   private String breed;
  private  String color;
  private  int age;
   private double weight;
Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
    name=dogName;
    breed=dogBreed;
    color=dogColor;
    if (dogAge>30){
        System.out.println("please enter a valid value");
    }else{
    age=dogAge;
    }

    weight=dogWeight;

}
    void printInfo(){
        System.out.println("name "+name+" "+breed+" "+"age "+age);
    }

    public static void main(String[] args) {
       // Dog dog=new Dog();
      //  dog.name="Decko";
      //  dog.breed="pitbull";
       // dog.color="gray";
       // dog.age=11;
       // dog.weight=30;
        Dog dog=new Dog("Decko","Pitbull","gray",11,30);
        dog.printInfo();

       // Dog dog2=new Dog();
      //  dog2.name="tommy";
     //   dog2.breed="boxer";
       // dog2.color="brown";
      //  dog2.age=9;
      //  dog2.weight=36;
        Dog dog2=new Dog("Tommy","Boxer","black",10,35);
        dog2.printInfo();

    }
}
