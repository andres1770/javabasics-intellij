package Class13;

public class task6 {
    public static void main(String[] args) {
        //How would you swap  2 strings without a temporary variable?
String str1="word";
String str2="Java";
str1=str1+str2;
str2=str1.substring(0,4);
str1=str1.substring(4);
        System.out.println(str1);
        System.out.println(str2);
        //or
        System.out.println("-------------------------------------");
        /*
How would you swap 2 strings without a temporary variable?
 */

        String str3="python";
        String str4="Java";
        str3=str3+str4;
        str4=str3.replace(str4,"");
        str3=str3.replace(str4,"");
        System.out.println(str4);
        System.out.println(str4);



    }
}
