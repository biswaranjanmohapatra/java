package function;
import java.util.Scanner;
public class binToDec {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decimalNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimalNum = decimalNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.println(decimalNum);
    }

    static void main() {
       binToDec(111);

    }
}
