package firstlecture;
import java.util.Scanner;
public class Typecasting {
  public static void main(String[] args) {
      System.out.println("please enter a number:");
        Scanner input = new Scanner(System.in);
        //Typecasting
    int num = (int)(67.55f);
      System.out.println(num);

//
//      //automatic type promation in expression
//      int a = 258;
//      byte b = (byte)(a); // 258 % 256 = 2
//      System.out.println(b);
//
//
//      int number = 'a';
//      System.out.println(number);
//      int num1 = 'A';
//      System.out.println(num1);




      //
      int a = 334;
      byte b = 23;
      float c = 23.56f;
      char d = 'A';
      double e = a + b + c + d;
      System.out.println(e);
    }
}
