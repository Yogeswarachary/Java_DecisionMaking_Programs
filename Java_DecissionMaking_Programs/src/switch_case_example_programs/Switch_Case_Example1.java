package switch_case_example_programs;

public class Switch_Case_Example1 {
	public static void main(String[] args) {
		
		//declaring variable for switch expression
		int number=20;
		//switch condition
		switch(number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("Hello Yogesh");
			break;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
			break;
		//Default case statement
		default:
			System.out.println("Not in 10, 20 or 30");
		}
	}
}
