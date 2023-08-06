import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String number = sc.next();
        {
            char firstDigit = number.charAt(0);
            char lastDigit = number.charAt(number.length() - 1);
            System.out.println("First digit: " + firstDigit);
            System.out.println("Last digit: " + lastDigit);
        }
        sc.close();
    }
}
