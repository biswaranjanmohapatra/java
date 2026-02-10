package _01_function;

import java.util.Scanner;

public class stringret {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        System.out.print("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String boys = sc.next();
        String mes = mygreet(boys);
        System.out.println(mes);

    }
//    static String greet(){
//
//       String greeting = "how are you";
//
//        return greeting;
//    }
    //argument calling function
    static String mygreet(String name){
        String message = "hi smruti i am your " +  name;
        return message;
    }



}
