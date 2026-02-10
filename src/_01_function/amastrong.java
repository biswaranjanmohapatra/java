package _01_function;

import java.util.Scanner;

public class amastrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(amastrng(n));
    }

    static boolean amastrng(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }

        return sum == original;
    }
}

