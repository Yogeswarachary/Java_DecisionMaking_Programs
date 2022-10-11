package if_else_statement_programs;

import java.util.Scanner;

public class If_Else_Example_Program3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number, to check it is Even or Odd:- ");
		int num=sc.nextInt();
		//using if condition
		if(num%2==0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("The given number is odd");
		}
	}
}
