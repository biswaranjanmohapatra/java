package eSecondlecture;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
      //for loops
//        for(int i = 1 ; i <=5 ; i++){
//            System.out.println(i);
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a num:");
        int num = input.nextInt();
        for(int i = 1; i<=num ; i++){
            System.out.println(i);
        }
    }
}
