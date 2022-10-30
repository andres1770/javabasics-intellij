package Class13;

import java.util.Arrays;

public class Stringrecap {
    public static void main(String[] args){
        String str="ASDFEFEafasd1545@%^#$%";
       str= str.replaceAll("[^a-z]","");

        System.out.println("str ="+str);
        String sentence="Batch14 is great. Batch 14 is excellent! Batch 14 is amazing ";
        String[] split = sentence.split("[.!]");
        System.out.println("split ="+ Arrays.toString(split));

        String str2="Batch14 is amazing. Batch14 is amazing";
        String replace = str2.replace("amazing", "good");
        System.out.println(replace);

    }


    }

