package if_statement_programs;

import java.util.Scanner;

public class Simple_If_Condition_Example2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:- ");
		int age=sc.nextInt();
		if(age>20) {
			System.out.println("You are eligible");
		}

	}

}
