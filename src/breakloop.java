import java.util.Scanner;
public class breakloop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        do{
            int n = sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);

        System.out.println("i am out off loop");
    }
}
