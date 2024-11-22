package week1.tsagana;

import java.util.Arrays;
import java.util.List;

public class FindUnique {
    /** Write a return method that can find the unique characters from the String
     * Ex:
     * unique("AAABBBCCCDEF")===>"DEF

     * */


    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(unique(str));//DEF


    }
   public static String unique(String str){
       String[]arr = str.split("");
       String result = "";
       for (int j = 0; j < str.length(); j++) {
           int num = 0;
           for (int i = 0; i < arr.length; i++) {
               if(arr[i].equals(arr[j])){
                   num++;
               }
           }
           if(num ==1){
               result += arr[j];
           }

       }
       return result;
   }
}
