package if_else_if_ladder_examples;

import java.util.Scanner;

public class Check_Positive_Negitive_Number6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:- ");
		int number=sc.nextInt();
		
		//applying if-condition
		if(number>0) {
			System.out.println("You have enterd the positive number");
		}
		else if(number<0) {
			System.out.println("You have enterd negitive number");
		}
		else {
			System.out.println("you have enterd zero");
		}
	}
}
