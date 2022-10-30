package Class13;

public class StringbuffervsStringbuilder {
    public static void main(String[] args) {
        StringBuilder stringbuilder= new StringBuilder("Today is a java class");
     StringBuffer stringbuffer= new StringBuffer("Today is java class");
     String str="Java is very easy";
     StringBuilder stringbuilder1=new StringBuilder(str);
//
  //      IF we want to convert from a StringBuilder to A String we can use
   //     the below syntax
    //            */
        String newStr=stringbuilder1.toString();



    }
}
