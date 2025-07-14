package Module1;
import java.util.*;
public class Info {
	public static void main(String[] args) {
		String name;
		int age;
		long phno;
		double cgpa;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter age");
		age=sc.nextInt();
		System.out.println("enter phno");
		phno=sc.nextLong();
		System.out.println("enter cgpa");
		cgpa=sc.nextDouble();
		System.out.println("My Details" );
		System.out.println("Full Name:"+name );
		System.out.println("Age:"+age );
		System.out.println("Phno:"+phno );
		System.out.println("Cgpa:"+cgpa);
	}	
}
