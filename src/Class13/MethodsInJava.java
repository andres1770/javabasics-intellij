package Class13;

import jdk.jshell.MethodSnippet;

public class MethodsInJava {
void printhello(){
    System.out.println("Hello World");
}
void printword(String word){
    System.out.println(word);
}
    public static void main(String[] args) {
        MethodsInJava obj= new MethodsInJava();
        obj.printhello();


        obj.printword("Andres don't worry");
    }
}
