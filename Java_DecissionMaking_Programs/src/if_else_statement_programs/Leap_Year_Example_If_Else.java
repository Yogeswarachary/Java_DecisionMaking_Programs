package if_else_statement_programs;

import java.util.Scanner;

public class Leap_Year_Example_If_Else {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year, to check if it is leap year or not:- ");
		int year=sc.nextInt();
		
		//writing condition
		if(((year%4==0)&&(year%100!=0)||(year%400==0))){
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Normal year");
		}
	}
}
