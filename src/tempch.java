import java.util.Scanner;
public class tempch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        if(temp>100.0){
            System.out.println("you have fevar");
        }
        else{
            System.out.println("not fever");
        }
    }
}
