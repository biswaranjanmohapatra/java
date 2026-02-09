import java.util.Scanner;
public class percen {
    static void main() {
     Scanner sc =new Scanner(System.in);
     float pen = sc.nextFloat();
     float penc = sc.nextFloat();
     float er = sc.nextFloat();
     float gst = (pen+penc+er)*18/100;
     float tp = gst + pen+penc+er;
        System.out.println(tp);
    }
}
