package module1;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num= sc.nextInt();
        int rev = 0;
        int temp = num;
        int rem = 0;
        while (temp != 0) {
            temp /= 10;
            rem++;
        }
        for (int i = 0; i < rem; i++) {
            rem= num % 10;
            rev = rev* 10 + rem;
            num = num / 10;
        }

        System.out.println("Reversed number: " + rev);
    }
}
