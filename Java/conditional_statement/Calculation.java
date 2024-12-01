// Write Calculator Program like Addition, Subtraction, Muktiplication And Division.

package conditional_statement;

import java.util.Scanner;
public class Calculation
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		System.out.print("Enter the Calculation type \nEnter 1 for Addition:\nEnter 2 for Subtraction:\nEnter 3 for Multiplication:\nEnter 4 for Division:");
		int calcu=sc.nextInt();
		switch(calcu) {
		case 1:
		{
			System.out.println("Addition is: "+(a+b));
		}
		break;
		case 2:
			System.out.println("Subtraction is: "+(a-b));
		break;

		case 3: 
			System.out.println("Multiplication is: "+(a*b));
		break;
		case 4:
		    System.out.println("Division is: "+(a/b));
		break;
		default : {
			System.out.println("Worng Operation");
		}
		}
	}
}
