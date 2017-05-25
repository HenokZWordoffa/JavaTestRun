package classRoom406;

import java.util.Scanner;

public class Hello406Again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String answer = null;
		
		do{
			System.out.println("Enter the number");
			
			int number = input.nextInt();
		if (number < 13){
			if(number == 1 || number == 3 || number == 5|| number==7|| number == 8|| number == 10 || number ==12){
				System.out.println("Have 31 Days");
			}
			else if(number == 2){
				System.out.println("Have 28 Days and 29 in a leap year");
			}
			else {
				System.out.println("Have 30 Days");
			}
			System.out.println("Do you want to continue? Y-Yes, N-No");
			answer = input.next();
		}
		else {
			System.out.println("Enter the right month");
			System.out.println("Do you want to continue? Y-Yes, N-No");
			answer = input.nextLine();
			}
	}while(answer.equalsIgnoreCase("y"));
		
		
		
	}
	}
