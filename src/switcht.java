import java.util.Scanner;
public class switcht {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int days= sc.nextInt();
        switch (days){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wedensday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("friday");
                break;
            default:
                System.out.println("saturday");
        }
    }
}
