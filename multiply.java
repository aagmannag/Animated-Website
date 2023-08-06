import java.util.*;
public class multiply {
   //Multiply 2 numbers
   public static int multiplys(int a, int b) {
       return a*b;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(multiplys(a, b));
       sc.close();
   }
}