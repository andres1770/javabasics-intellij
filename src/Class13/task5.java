package Class13;

public class task5 {
    public static void main(String[] args) {

        String str="dad";
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str)){
            System.out.println("the String is palindrome ");
        }else{
            System.out.println("the String is not palindrome ");
        }
    }
}
