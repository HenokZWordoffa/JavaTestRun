package classRoom406;
/*A java code used to check the number of days in each month*/
import java.util.Scanner;

public class monthChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String answer = null;
		
		do{
			System.out.println("Enter the Month in three Character");
			
			String inputMonth = input.next();
		if (inputMonth.length() == 3){
			if(inputMonth.equalsIgnoreCase("jan") ||  inputMonth.equalsIgnoreCase("mar") || 
				inputMonth.equalsIgnoreCase("may") || inputMonth.equalsIgnoreCase("jul") ||
				inputMonth.equalsIgnoreCase("aug") || inputMonth.equalsIgnoreCase("oct") ||
				inputMonth.equalsIgnoreCase("des")){
				System.out.println("Have 31 Days");
			}
			else if(inputMonth.equalsIgnoreCase("feb")){
				System.out.println("Have 28 Days and 29 in a leap year");
			}
			else if(inputMonth.equalsIgnoreCase("apr") || inputMonth.equalsIgnoreCase("jun") ||
					inputMonth.equalsIgnoreCase("sep") || inputMonth.equalsIgnoreCase("nov")){
				System.out.println("Have 30 Days");
			}
			else {
				System.out.println("Its not a month");
			}
			System.out.println("Do you want to continue? Y-Yes, N-No");
			answer = input.next();
		}
		else {
			System.out.println("Error!!! please Enter the month in three char like Jan, Feb...");
			System.out.println("Do you want to continue? Y-Yes, N-No");
			answer = input.next();
			}
	}while(answer.equalsIgnoreCase("y"));
		
		
		
	}

}
