package switch_case_example_programs;

import java.util.Scanner;

public class Checking_Vowels_Using_Switch3 {
	public static void main(String[] args) {
		//Requesting user to enter the one-character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character, to check it is vowel or consonent:- ");
		char ch=sc.next().charAt(0);
		
		//switch condition
		switch(ch) {
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		//checking capital vowels
		case 'A':
			System.out.println("Vowel");
			break;
		case 'E':
			System.out.println("Vowel");
			break;
		case 'I':
			System.out.println("Vowel");
			break;
		case 'O':
			System.out.println("Vowel");
			break;
		case 'U':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}
		
	}
}
