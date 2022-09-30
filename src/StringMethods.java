public class StringMethods {
    public static void main(String[] args) {
        String str = "hello";
      // toUppercase  toLowerCase
 str.toUpperCase();  //this will not work
        System.out.println(str);

        System.out.println("_____________________________________");

        str=str.toUpperCase();
        System.out.println(str);
        //length() -> gives size

        int size=str.length();
        System.out.println(size);

        //charAt -> return a char value at the specified index

       char  letter=str.charAt(4);
        System.out.println(letter);

        //how to print last character
        char lastCharacter=str.charAt(str.length()-1);
        System.out.println(lastCharacter);

        //indexOf -> return the index within this string
       int index= str.indexOf(lastCharacter);
        System.out.println(index);//4

        System.out.println(str.indexOf('a'));//-1

        // isEmpty
         boolean empty=str.isEmpty();
        System.out.println(empty);

        //trim();




    }
}