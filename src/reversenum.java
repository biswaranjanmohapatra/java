import java.util.Scanner;
public class reversenum {
    static void main() {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            int lastd = n%10;
            System.out.print(lastd);
            n/=10;
        }
    }

}
