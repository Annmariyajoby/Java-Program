package module1;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        long factorial = 1;
        System.out.print("Enter a number:");
        number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
	}
}
