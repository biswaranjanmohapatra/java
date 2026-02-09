import java.util.Scanner;
public class odde {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("it is even num");
        }
        else{
            System.out.println("odd num");
        }

    }
}
