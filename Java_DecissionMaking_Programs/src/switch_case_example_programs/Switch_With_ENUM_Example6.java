package switch_case_example_programs;

public class Switch_With_ENUM_Example6 {
	//creating enum for weekly days
	public enum Day{Sun,Mon,Tue,Wed,Thu,Fri,Sat}
	
	public static void main(String[] args) {
		Day[] dayNow=Day.values();
		for(Day now:dayNow) {
			switch(now) {
			case Sun:
				System.out.println("Sunday");
				break;
			case Mon:
				System.out.println("Monday");
				break;
			case Tue:
				System.out.println("Tuesday");
				break;
			case Wed:
				System.out.println("Wednesday");
				break;
			case Thu:
				System.out.println("Thursday");
				break;
			case Fri:
				System.out.println("Friday");
				break;
			case Sat:
				System.out.println("Saturday");
				break;
			}
		}
	}
}
