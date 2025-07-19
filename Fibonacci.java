package module1;
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit;

        System.out.print("Enter limit of Fibonacci series: ");
        limit = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + limit + ":");
        
        while (a <= limit) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
