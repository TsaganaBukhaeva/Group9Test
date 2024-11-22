package week1.tsagana;

public class Remove_Duplicates {
    /** Write a return method that can remove the duplicated from String
     * Ex: "AAABBBCCCCC" ===> ABC
     * */
    public static void main(String[] args) {
      String str = "AAABBBCCCCC";
       System.out.println(removeDuplicates(str)); //ABC
      //  String str = "Tsagana";
      //  System.out.println(removeDuplicates(str));//Tsagn
    }
    public static String removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result+= str.charAt(i);
            }
            }
            return result;
        }
    }
