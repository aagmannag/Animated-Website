import java.util.*;
public class infinite{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(; ;n++) {
            System.out.println("infinite");
            System.out.println(n);sc.close();
        }
    }
}

