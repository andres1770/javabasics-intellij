package Class13;

public class task {
    public static void main(String[] args) {


            String str="dsfkjAJSKA1263#%6";
            str=str.replaceAll("[^a-zA-Z0-9]","");
            System.out.println("str = " + str);
            System.out.println(str.length());

        }
    }
