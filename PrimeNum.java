package module1;
import java.util.*;
public class PrimeNum {
	 public static void main(String args[]) {
	        int limit = 100;
	        System.out.println("Prime numbers between 1 and 100:");
	        for (int i = 2; i <= limit; i++) {
	            int count = 0;
	            for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    count++;
	                    break;
	                }
	            }
	            if (count == 0) {
	                System.out.println(i);
	            }
	        }
	   }
}
