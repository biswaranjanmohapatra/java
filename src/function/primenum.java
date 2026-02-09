package function;
import java.util.*;
public class primenum {
    public static boolean isprime(int n){
        if (n == 1) {
            return false;
        }
        for (int i =2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    static void main() {
        System.out.println(isprime(1));
    }
}
