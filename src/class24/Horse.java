package class24;

public class Horse {
   private String name;
   private String color;
   private int age;
   private double weight;
   private String food;

    public Horse(String name, String color, int age, double weight, String food) {
        setName(name);
        setColor(color);
        setAge(age);
        setWeight(weight);
        setFood(food);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()){
            System.out.println("name cant be empty please try again ");
        }else {
            this.name = name;

        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("color cant be empty");
        }else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
      if(age<0) {
          System.out.println("age can not be 0");
      }else {this.age = age;
      }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight<0){
            System.out.println("weight can not be 0");
        }else {
            this.weight = weight;
        }
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if(food.isEmpty()){
            System.out.println("food can not be empty");
        }else {
            this.food = food;
        }
    }
}
