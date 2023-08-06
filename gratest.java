import java.util.*;
public class gratest{
    public static int grater(int a, int b){
        if(a<b)
        {
            return(b);
        }
        else{
            return(a);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("gratest no is "+grater(a, b));
        sc.close();
    }
}