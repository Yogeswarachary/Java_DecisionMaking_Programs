package if_else_if_ladder_examples;

import java.util.Scanner;

public class If_Else_If_Ladder_Example5_Student_Grade {
	public static void main(String[] args) {
		
		//Requesting user to enter name
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:- ");
		String name=sc.next();
		
		//Requesting user to enter the marks
		System.out.println("Enter your score/Marks:- ");
		int marks=sc.nextInt();
		
		//Applying if condition
		if(marks<50) {
			System.out.println(name+" is failed");
		}
		else if(marks>=50 && marks<60) {
			System.out.println(name+" is secured 'D' grade");
		}
		else if(marks>=60 && marks<70) {
			System.out.println(name+" is secured 'C' grade");
		}
		else if(marks>=70 && marks<80) {
			System.out.println(name+" is secured 'B' grade");
		}
		else if(marks>=80 && marks<90) {
			System.out.println(name+" is secured 'A' grade");
		}
		else if(marks>=90 && marks<100) {
			System.out.println(name+" is secured 'A+' grade");
		}
		else {
			System.out.println(name+" You have entered wrond data");
		}
		
	}
}
