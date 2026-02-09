package eSecondlecture;

public class Condition {
   public static void main(String[] args) {
        int salary = 24000;
        //if-else statement
//        if(salary > 10000){
//            salary += 2000;
//        }
//        else {
//            salary += 1000;
//        }
       if(salary > 10000){
            salary += 2000;
        }
        else if(salary > 20000) {
            salary += 1000;
        }
        else {
            salary += 500;
       }
       System.out.println(salary);
    }
}
