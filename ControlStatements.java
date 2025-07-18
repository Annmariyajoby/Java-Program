package module1;
import java.util.Scanner;
public class ControlStatements {
	 public static void main(String[] args) {
	        int mark;
	        String grade;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Mark:");
            mark=sc.nextInt();
	        if (mark>= 90) {
	            grade = "S";
	        }
	        else if (mark>= 85 && mark< 90) {
	            grade = "A+";
	        }
	        else if (mark>= 80 && mark< 85) {
	            grade = "A";
	        }
	        else if (mark >= 75 && mark< 80) {
	            grade = "B+";
	        }
	        else if (mark>= 70 && mark< 75) {
	            grade = "B";
	        }
	        else if (mark>= 65 && mark< 70) {
	            grade = "C+";
	        }
	        else if (mark>= 60 && mark< 65) {
	            grade = "C";
	        }
	        else if (mark>= 55 && mark< 60) {
	            grade = "D";
	        }
	        else if (mark>= 50 && mark< 55) {
	            grade = "P";
	        }
	        else {
	            grade = "F";
	        }

	        System.out.println("Grade of the student who scored: " + mark + " is: " + grade);
	   }
}


