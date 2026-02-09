import java.util.Scanner;
public class sumwh {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        int sum = 0;
        while (num <=n) {
            sum = num + sum;
            num++;
        }
        System.out.println(sum);
    }
}
