package nested_switch_examples;

import java.util.Scanner;

public class Nested_Switch_Example1 {
	public static void main(String[] args) {
		//C-CSE, E-ECE,M-Mechanical,I-IT
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character to check your branch (C-CSE, E-ECE,M-Mechanical,I-IT.Capital letters only):- ");
		char branch=sc.next().charAt(0);
		System.out.println("Please enter your year to check your subjects(1,2,3,4 only):- ");
		int year=sc.nextInt();
		switch(year) {
		case 1:
			System.out.println("English,Maths,Science,Drawing,Workshop,Labs");
			break;
		case 2:
			switch(branch) {
			case 'C':
				System.out.println("Java,C++,Maths,DLD,MFCS");
				break;
			case 'E':
				System.out.println("BEE,Electronics,Maths,Basic electronics,NT");
				break;
			case 'M':
				System.out.println("Basic Machanics,Gears,Machines,Carpentary,Welding");
				break;
			case 'I':
				System.out.println("Java,C++,Maths,DLD,MFCS");
			}
			break;
		case 3:
			switch(branch) {
			case 'C':
				System.out.println("Crypography,Network-security,Python,DAA,BEFA");
				break;
			case 'E':
				System.out.println("DLD-2,Cirtuit theory,network topology,Ac-Dc circuits, Power electronics");
				break;
			case 'M':
				System.out.println("Diesel machanics,Engine theory,Thermopdynamics,Air conditioning,fuel injection");
				break;
			case 'I':
				System.out.println("Crypography,Network-security,Python,DAA,BEFA");
				break;
			}
			break;
		case 4:
			switch(branch) {
			case 'C':
				System.out.println("Project,Linux,Cloud computing,Computer Networks");
				break;
			case 'E':
				System.out.println("Project,Java,Network,BDPS");
				break;
			case 'M':
				System.out.println("Project, Engineering machine, turbine, boiler working");
				break;
			case 'I':
				System.out.println("Project,Linux,Cloud computing,Computer Networks");
				break;
			}
			break;
		}
		
	}
}
