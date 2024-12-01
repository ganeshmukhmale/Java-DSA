// Write a program to Print Table 1 to n

package Looping;

import java.util.Scanner;
public class Tables_1ton
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value:");
		int no=sc.nextInt();
 		for(int i=1;i<=no;i++)
 		{
 		    for(int j=1;j<=10;j++) 
 		    {
 		        System.out.println("Table"+i+"*"+j+"="+i*j);
 		    }
 		    System.out.println();
		}
	}
}
