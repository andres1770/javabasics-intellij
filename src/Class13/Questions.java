package Class13;

public class Questions {
    public static void main(String[] args){

        //how would you reverse a string without using reverse function
/*
1.use Stringbuilder and reverse method
2.use charAt();
3.use toCharArray();
 */
        String str="hello";
        String newString="";

        for (int i=str.length()-1;i>=0;i--){
            newString=newString+str.charAt(i);
            System.out.println(newString);
        }
        String s="class is almost over";
       StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
// how would you find if a string is a palindrone

    }
}
