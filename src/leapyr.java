import java.util.Scanner;
public class leapyr {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ((year % 400 == 0)|| (year %4 == 0 && year % 100 !=0)) {
            System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        }
    }

