package if_else_if_ladder_examples;

import java.util.Scanner;

public class If_Else_If_Ladder_Example2 {
	public static void main(String[] args) {
		int i=20;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int num=sc.nextInt();
		
		//condition1
		if(i>num) {
			System.out.println(num+" is less than the "+i);
		}
		else if(i<num) {
			System.out.println(num+" is greter than the "+i);
		}
		else if(i>=num) {
			System.out.println(num+" is less than or equal to "+i);
		}
		else if(i<=num) {
			System.out.println(num+" is greter than or equal to "+i);
		}
		else {
			System.out.println("Inside the loop");
		}
		System.out.println("You are in the outside of the if-else-if");
	}
}
