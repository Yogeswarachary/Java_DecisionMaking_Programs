package if_else_if_ladder_examples;

public class If_Else_If_Ladder_Example4 {
	public static void main(String[] args) {
		int number=0;
		
		//Checks if number is greater than 0
		if(number>0) {
			System.out.println("The number is positive");
		}
		//Checks if number is less than 0
		else if(number<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is 0");
		}
		
	}
}
