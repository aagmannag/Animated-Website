import java.util.*;
public class in{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int size= sc.nextInt();
        int a[]=new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0;i<a.length;i++){
            if (a[i]<min){
                min=a[i];
            }
            if (a[i]>max){
                max=a[i];
            }
       }
       System.out.println("Largest number is : " + max);
       System.out.println("Smallest number is : " + min); 
       sc.close();
    }
}
