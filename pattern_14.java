// import java.util.*;
public class pattern_14{
    public static void main(String[] args) {
        int n=4;
        for (int i=1;i<=4;i++){
            for (int j=(n-1);j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=4;i>=1;i--){
            for (int j=(n-1);j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}