import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		Scanner scnrAns = new Scanner(System.in);
		
		int input;
		String name;
		boolean ans = true;
		
		System.out.print("Enter name here: ");
		name = scnr.nextLine();
		
		while(ans) {
		System.out.print(name + " please enter a integer between 1 and 100: ");
		input = scnr.nextInt();
		
		if(input <= 0 || input > 100) {
			scnr.close();
			throw new IllegalArgumentException("Must use a number between 1 - 100");
		}
		
		if(input % 2 == 0) {
			if(input < 25) {
				System.out.println(name + " your input is even and less than 25.");
			}
			else if(input > 60) {
				System.out.println(name + " your input was " + input + " and is even.");
			}
			else {
				System.out.println(name + " your input was even.");
			}
		}
		else {
			if(input > 60) {
				System.out.println(name + " your input " + input + " is odd and over 60.");
			}
			else {
				System.out.println(name + " your input " + input + " is odd.");
			}
		}
		System.out.print("Would you like to try another number " + name +"?(y/n): ");
		if(scnrAns.next().equalsIgnoreCase("n"))
			ans = false;
		}
		System.out.println(name + " thank you for using Decision-Making Process. Goodbye.");
		scnr.close();
	}

}
