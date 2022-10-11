package nested_if_else_programs;

import java.util.Scanner;

public class Check_User_Able_To_Donate_Blood3 {
	public static void main(String[] args) {
		
		//Requesting user to enter name, age, weight
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name:- ");
		String name=sc.next();
		//requesting to enter age
		System.out.println("Please enter your age:- ");
		int age=sc.nextInt();
		//requesting to enter weight
		System.out.println("Please enter your weight:- ");
		int weight=sc.nextInt();
		
		//Applying if-condition
		if(age>18) {
			if(weight>50) {
				System.out.println(name+" You are eligible for Donate blood");
			}
			else {
				System.out.println(name+" You are not eligible to donate blood");
			}
		}
		else {
			System.out.println(name+" your age must be greater than the 18");
		}
		
	}
}
