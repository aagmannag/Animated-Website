import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int c=-0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
            else{
            }
        }
        if(c==1)
        System.out.println("neither Prime nor composit");
        else if(c==2)
        System.out.println("Prime");
        else
        System.out.println("Not Prime");
        sc.close();
    }
}
