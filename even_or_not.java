import java.util.*;
public class even_or_not{
    public static void eve_or_not(int n){
        if(n%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("not even");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        eve_or_not(n);
        sc.close();
    }
}