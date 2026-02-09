package function;
import java.util.*;
public class swap {
    public static void swap(int a,int b){


         int temp = a;
         a=b;
         b=temp;

        System.out.println(a);
        System.out.println(b);

    }

    static void main() {
     Scanner sc = new Scanner(System.in);
     int a= sc.nextInt();
     int b= sc.nextInt();
     swap(a,b);
    }
}
