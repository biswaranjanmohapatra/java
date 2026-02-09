package eSecondlecture;

import java.util.Scanner;

public class Countingocc {
   public static void main(String[] args) {
    int n = 555555;
    int count = 0;
    while (n > 0){
        int rem = n %10;
        if(rem == 5){
            count++;
        }
        n = n/10;
    }
       System.out.println(count);
    }
}
