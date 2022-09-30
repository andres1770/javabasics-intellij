import java.sql.SQLOutput;
import java.util.Arrays;

public class StringMethods1 {
    public static void  main(String[] args){
        //trim()
        String textFromApplication="  Enroll today ";
        String textFromUserStory="Enroll today";
        if (textFromApplication.trim().equals(textFromUserStory)) {
            System.out.println("Text is match");
        } else {
            System.out.println("Text is not match");
        }
        System.out.println(textFromApplication.trim());
// substring
        String str="Hello Class";
       String part2= str.substring(6);
        System.out.println(part2);
String part3=str.substring(0,5);
        System.out.println(part3);
// concat
        String newString=part3.concat(" ").concat(part2);
        System.out.println(newString);
         //some examples

      char single=  newString.substring(6).charAt(0);
        System.out.println(single);

//newString.charAt(0).substring(6); ERROR
        //replace
        String myString="Today is September";
        myString=myString.replace("September","October");
        System.out.println(myString);

        myString=myString.replace('T','t');
        System.out.println(myString);
// split
        String mystr="Today is a review class";
       String[] arr= mystr.split(" ");
        System.out.println(arr.length);//5
        System.out.println(arr[4]);//review
       for (int i =0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
       //other way
        for(String array:arr){
            System.out.println(array);
        }
        System.out.println(Arrays.toString(arr));
    }
}
