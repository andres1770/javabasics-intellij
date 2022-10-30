package class14;

import java.util.Scanner;

public class everyOtherCharacter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        String word2="";
        for (int i=2;i<word.length();i++){
            if (word.charAt(i)==word.charAt(i-1)){
                continue;
            }word2=word2+word.charAt(i);
        } System.out.println(word.charAt(0)+word2);
    }
}

