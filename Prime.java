package module1;
import java.util.Scanner;
public class Prime {
	    public static void main(String args []){
	        int count=0;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int num=sc.nextInt();
	        for(int i=2;i<=num/2;i++)
	        {
	            if(num%i==0){
	              count++;
	            }
	      
	        }
	        if(count==0 && num>1){
	            System.out.println(num+" is prime number");
	        }
	        else{
	            System.out.println(num+" is not prime number");
	        }
	    }
}


