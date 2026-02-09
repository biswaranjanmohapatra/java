package eSecondlecture;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans;

        while (true) {
            System.out.print("Enter operator (+ - * / % or x to exit): ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter first number: ");
                int num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Cannot divide by zero");
                        continue;
                    }
                } else {   // %
                    ans = num1 % num2;
                }

                System.out.println("Answer = " + ans);
            } else {
                System.out.println("Invalid operator");
            }
        }

        System.out.println("Calculator closed");
    }
}
