package eSecondlecture;
import java.util.Scanner;
import java.util.*;
public class Largestnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a num a:");
        int a = sc.nextInt();
        System.out.println("please enter a num b:");
        int b = sc.nextInt();
        System.out.println("please enter a num c:");
        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println(a);
//        } else if (b>c && b>a) {
//            System.out.println(b);
//        } else  {
//            System.out.println(c);
//        }
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
