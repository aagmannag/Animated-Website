// import java.util.*;

public class pattern_15 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ((i + j) == 5 || j == 4) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if((i+j)==5||j==4){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}