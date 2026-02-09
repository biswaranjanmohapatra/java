package function;
import java.util.Scanner;
public class factorial {
    public static int factorial(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    static void main() {


        System.out.println(factorial(5));
    }
}
