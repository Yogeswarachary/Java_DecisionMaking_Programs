package switch_case_example_programs;

import java.util.Scanner;

public class Switch_String_Example_Program5 {
	public static void main(String[] args) {
		//requesting user to enter string data
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your knowledge level'Beginner,Intermidiate,Expert only'");
		String levelString=sc.next();
		int level=0;
		
		//using string in switch case
		switch(levelString) {
		case "Beginner":level=1;
		break;
		
		case "Intermediate":level=2;
		break;
		
		case "Expert":level=3;
		break;
		
		default: level=0;
		break;
		}
		System.out.println("your level is:- "+level);
		
	}
}
