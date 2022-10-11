package switch_case_example_programs;

import java.util.Scanner;

public class Calculator_Program_Using_Switch_4_1 {
	public static void main(String[] args) {
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a value:- ");
		int a=sc.nextInt();
		System.out.println("Please enter b value:- ");
		int b=sc.nextInt();
		System.out.println("Please choose operator(Number only):- ");
		System.out.println("enter 1 for Addition operation");
		System.out.println("enter 2 for Substraction operation");
		System.out.println("enter 3 for Multiplication operation");
		System.out.println("enter 4 for Division operation");
		System.out.println("enter 5 for Modulus operation");
		int ch=sc.nextInt();
		
		//applying switch case
		switch(ch) {
		case 1:
			result=a+b;
			System.out.println("The Addition of a and b is:- "+result);
			break;
		case 2:
			result=a-b;
			System.out.println("The Subtraction of a and b is:- "+result);
			break;
		case 3:
			result=a*b;
			System.out.println("The Multiplication of a and b is:- "+result);
			break;
		case 4:
			result=a/b;
			System.out.println("The Division of a and b is:- "+result);
			break;
		case 5:
			result=a%b;
			System.out.println("The Modulas of a and b is:- "+result);
			break;
		default:
			System.out.println("Invalid Operator!,Please choose the appropriate Operator");
			break;
		}
	}
}
