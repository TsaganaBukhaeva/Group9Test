package week1.tsagana;
///**Java Coding Tasks - Week3
///   swapTwoNumbers:
/// Swap two int variables' values
///  without using a third variable*/
public class SwapTwoNumbers {
    public static void main(String[] args) {

       int a = 8, b = 4;

     swapTwoNumbers(a,b);
      //  swapTwoNumbers(8,4);
    }



    public static void swapTwoNumbers(int a, int b) {


        a = a+b; //12=8+4

        b = a-b; //8=12-4

        a = a-b; //4=12-8

        System.out.println("before swapping : a = 8, b = 4");
        System.out.println("after swapping : a = " +a+ " b = " +b+ " ");
    }

}
