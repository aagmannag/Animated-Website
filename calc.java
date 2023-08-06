import java.util.*;
public class calc{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first no.");
        int a=sc.nextInt();
        System.out.println("Enter second no.");
        int b=sc.nextInt();
        System.out.println("Enter 1 for + ,2 for - ,3 for *, 4 for /,5 for %");
        int c=sc.nextInt();
        if(c==1)
        System.out.println("The sum of a and b is ="+(a+b));
        else if(c==2)
        System.out.println("The difference of a and b is ="+(a-b)); 
        else if(c==3)
        System.out.println("The * of a and b is ="+(a*b));
        else if(c==4)
        System.out.println("The / of a and b is ="+(a/b));
        else if(c==5)
        System.out.println("The % of a and b is ="+(a%b));
        else
        System.out.println("invalid choice");
        sc.close();
    }
}