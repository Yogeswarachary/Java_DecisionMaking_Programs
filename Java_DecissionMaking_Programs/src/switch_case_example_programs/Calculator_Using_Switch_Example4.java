package switch_case_example_programs;

import java.util.Scanner;

public class Calculator_Using_Switch_Example4 {
	public static void main(String[] args) {
		//Requesting the user to enter number
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 'a' value:- ");
		int a=sc.nextInt();
		
		System.out.println("Please enter 'b' value:- ");
		int b=sc.nextInt();
		
		//Requesting user to enter the Operator
		System.out.println("Please enter the Operator symbol, to perform operation'+,-,*,/,% only':- ");
		char operator=sc.next().charAt(0);
		
		//Applying switch condition
		switch(operator) {
		case '+':
			result=a+b;
			System.out.println("The addition of 'a' and 'b' is:- "+result);
			break;
		case '-':
			result=a-b;
			System.out.println("The subtraction of 'a' and 'b' is:- "+result);
			break;
		case '*':
			result=a*b;
			System.out.println("The multiplication of 'a' and 'b' is:- "+result);
			break;
		case '/':
			result=a/b;
			System.out.println("The division of 'a' and 'b' is:- "+result);
			break;
		case '%':
			result=a%b;
			System.out.println("The modulus of 'a' and 'b' is:- "+result);
			break;
		default:
			System.out.println("Invalid Operator");
		}
	}
}
