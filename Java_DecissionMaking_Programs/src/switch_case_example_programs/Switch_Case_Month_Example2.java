package switch_case_example_programs;

import java.util.Scanner;

public class Switch_Case_Month_Example2 {
	public static void main(String[] args) {
		
		//Specifying month number
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the month number:- ");
		int month_num=sc.nextInt();
		
		//initializing the month variable
		String monthString="";
		//switch condition
		switch(month_num) {
		case 1:monthString="January";
		break;
		case 2:monthString="February";
		break;
		case 3:monthString="March";
		break;
		case 4:monthString="April";
		break;
		case 5:monthString="May";
		break;
		case 6:monthString="June";
		break;
		case 7:monthString="July";
		break;
		case 8:monthString="August";
		break;
		case 9:monthString="September";
		break;
		case 10:monthString="October";
		break;
		case 11:monthString="November";
		break;
		case 12:monthString="December";
		break;
		default:System.out.println("You have entered invalid month number");
		}
		System.out.println(monthString);
	}
}
