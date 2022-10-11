package nested_if_else_programs;

public class Nested_If_Else_Example1 {
	public static void main(String[] args) {
		String address="Khammam, Telangana";
		
		if(address.endsWith("Telangana")) {
			if(address.contains("Hyderabad")) {
				System.out.println("Your city is Hyderabad, and you are in Telanagana state");
			}
			else if(address.contains("Khammam")) {
				System.out.println("Your city is Khammam, and you are in Telangana");
			}
			else if(address.contains("Adilabad")) {
				System.out.println("Your city is Adilabad, you are in Telangana state");
			}
			else if(address.contains("Kothagudem")) {
				System.out.println("Your city is kothagudem, you are in Telangana state");
			}
			else {
				System.out.println("You are in outside of the Telangana state");
			}
		}
	}
}
