package eSecondlecture;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();
//        switch (fruit){
//            case "Mango":
//                System.out.println("king of all fruits");
//                break;
//            case "Apple":
//                System.out.println("a red fruit and sweet");
//                break;
//            case "Orange":
//                System.out.println("a orange fruit");
//                break;
//
//            case "Grapes":
//                System.out.println("A summer fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }

        int days = sc.nextInt();
        switch (days){
            case  1:
                System.out.println("Monday");
                break;
            case  2:
                System.out.println("Tuesday");
                break;
            case  3:
                System.out.println("Wendsday");
                break;
            case  4:
                System.out.println("Thruesday");
                break;
            case  5:
                System.out.println("Friday");
                break;
            case  6:
                System.out.println("Saturday");
                break;
            case  7:
                System.out.println("Sunnday");
                break;
            default:
                System.out.println("invalid days");

        }


    }
}
