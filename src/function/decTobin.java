package function;

public class decTobin {
    public static void decToBin(int decimal){
        int pow = 0 ;
        int binary = 0;
        while(decimal>0){
            int remainder = decimal % 2;
            binary = binary + remainder * (int)Math.pow(10,pow);
            pow++;
            decimal/=2;
        }
        System.out.println(binary);
    }

    static void main() {
        decToBin(63);
    }
}
