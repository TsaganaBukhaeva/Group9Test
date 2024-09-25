package week1.tsagana;
/****Java Coding Tasks - Week2 📢 📌 💪 🥳**
 ➡️  FINRA:
 Write a function that prints out the numbers from 1 to 30
 but for numbers that are a multiple of 3, print "FIN" instead of the number,
 and for numbers that are a multiple of 5, print "RA" instead of the number.
 For numbers that are a multiple of both 3 and 5, print "FINRA" instead of the number.*/
public class FinRa {

    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str = "FINRA";
            } else if (i % 3 == 0) {
                str = "FIN";
            } else if (i % 5 == 0) {
                str = "RA";
            } else {
                str = String.valueOf(i);
            }
            System.out.println(str + " ");
            //1      7
            //2      8
            //   FIN


            //4
            //RA
            //Done
        }
    }
    }

