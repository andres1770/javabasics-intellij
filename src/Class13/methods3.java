package Class13;

import com.sun.security.jgss.GSSUtil;

public class methods3 {
   boolean isEven(int num){
       return num % 2 == 0;
   }

    public static void main(String[] args) {

       methods3 md=new methods3();
       if(md.isEven(4)){
           System.out.println("number is even ");
       }else
           System.out.println("number is odd");

    }


}
