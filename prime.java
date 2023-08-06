import java.util.*;
public class prime{
    public static void pri(int n){
        int c=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                c+=1;
            }
            else{
            }
        }
        if (c==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pri(n);
        sc.close();

    }
}