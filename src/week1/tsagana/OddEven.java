package week1.tsagana;
/** Numbers -- odd & even
 Write a method that can identify  a given number is even or odd.
 EX:
 identify(5) --> "Odd"
 identify(6) --> "Even"
 * */
public class OddEven {
    public static void main(String[] args) {
        System.out.println(identify(7)); //odd
        System.out.println(identify(4)); //even
    }


    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

//done
}
