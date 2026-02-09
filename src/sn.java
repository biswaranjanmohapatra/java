import java.util.Scanner;

public class sn {
    static void main() {
        Scanner sc=  new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();
        if(age>18){
            System.out.println("no boy not yet");
        }
        else{
            System.out.println("he is boy");
        }

        }
    }
