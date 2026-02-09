import java.util.*;
public class primenum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int num = sc.nextInt();
     boolean   isprime=true;
        if(num==2){
            System.out.println("is not prime");
        }
        else{

            for (int i =2;i<=Math.sqrt(num);i++){
                if (num%i==0){
                   isprime = false;
                }

            }
            if (isprime==true){
                System.out.println("prime");
            }
            else {
                System.out.println("not prime");
            }
        }
    }
}
