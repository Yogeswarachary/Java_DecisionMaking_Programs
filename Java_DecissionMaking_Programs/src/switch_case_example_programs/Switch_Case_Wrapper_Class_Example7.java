package switch_case_example_programs;

import java.util.Scanner;

public class Switch_Case_Wrapper_Class_Example7 {
	public static void main(String[] args) {
		int age=65;
		
		//applying switch case
		switch(age) {
		case(17):
			System.out.println("You are under 18");
			break;
		case(18):
			System.out.println("You are eligible for vote");
			break;
		case(65):
			System.out.println("You are senior citizen");
			break;
		default:
			System.out.println("Please give the valid age");
			break;
		}
	}
}
