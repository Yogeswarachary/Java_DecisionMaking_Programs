package if_else_statement_programs;

import java.util.Scanner;

public class If_Else_Example_Program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age:- ");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("You are eligible for vote");
		}
		else {
			System.out.println("You are not eligible for vote");
		}
	}
}
