public class rev {
    static void main() {
        int n= 10999;
        int rev = 0;

        while ( n>0){
          int  lastd= n%10;
          rev = (rev*10)+lastd;
          n/=10;
        }
        System.out.println(rev);
    }
}
