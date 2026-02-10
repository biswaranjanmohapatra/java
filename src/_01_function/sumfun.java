package _01_function;

import java.util.Scanner;

public class sumfun {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    //return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum (){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter number 2:");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is = " +  sum);
    }
}
