package _01_array;
import java.util.*;

public class arrc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//       arr[0]=1;
//       arr[1]=2;
//       arr[2]=3;
//       arr[3]=4;
//       arr[4]=5;
//        for (int i = 0;i< arr.length;i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();

//        //using to string
//        int[] arr1 = {1,2,3,55,7,9};
//        System.out.println(Arrays.toString(arr1));



        // array in object
        String[] str = new String[4];

        for (int i = 0; i< str.length;i++){
            str[i]= sc.next();
        }
        System.out.print(Arrays.toString(str));
        str[1]="rahul";
        System.out.println();
        System.out.print(Arrays.toString(str));

    }
}
