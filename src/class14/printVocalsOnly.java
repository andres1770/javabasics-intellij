package class14;

import java.util.Scanner;

public class printVocalsOnly {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String str = inp.nextLine();
        //write your code below
        for (int i = 0; i < str.length(); i++) {
            // Check a character is vowel or not
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // Display each vowel
                System.out.print(" " + str.charAt(i));
            }
        }
    }
}

