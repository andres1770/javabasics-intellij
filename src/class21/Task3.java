package class21;

public class Task3 {
    static void print(){
        System.out.println("i love java");
    }
    static void print(String str){

        System.out.println("i love "+str);
    }
    static void print(String str,int times){
        for (int i=0;i<times;i++){
        System.out.println("i love "+str);
    }}

    public static void main(String[] args) {
        print("javascript",5);
    }
}
