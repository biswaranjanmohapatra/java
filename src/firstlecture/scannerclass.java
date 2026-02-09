package firstlecture;
import java.util.Scanner;
public class scannerclass {
    public static void main(String[] args){
        System.out.println("please enter some input:");
       Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        System.out.println(a);
    }
}
