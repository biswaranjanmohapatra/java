import java.util.Scanner;
public class multiplen {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul;
        for (int i = 1;i<=10;i++){
            mul = i*n;
            System.out.println(mul);
        }
    }
}
