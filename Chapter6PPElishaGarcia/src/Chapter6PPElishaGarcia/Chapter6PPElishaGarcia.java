package Chapter6PPElishaGarcia;


/**Student Name: Elisha Garcia

*Date Completed: 04/20/2020

*Project No. and Page No. in the book: Project 5, chapter 6, pg. 255-271

*Extra Credit: No

*Project Description: Asking the user to enter his/her name out hen giving an output that asks for an amount of numbers 
*					  equal to the letter in the name then calculating the total of the numbers given. Using for loops, 
*					  while loops, and if statements.

**/



import java.util.*;


public class Chapter6PPElishaGarcia {
	
	public static void main (String[] args) {
		
		//declaring variable userFullName and giving it a value of "temp" so we can change it later. Also declaring 
		//count and total for the for loop calculations.
		String userFullName = "temp";
		int count = 0, total = 0;
		
		//wrapping everything in a while loop so the user can enter "quit" to exit the program.
		while (!userFullName.equalsIgnoreCase("quit")) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Please enter your full name: ");
			userFullName = scan.nextLine();
			
			//going through each place in userFullName and incrementing count except for when there is a space.
			for (int i = 0; i < userFullName.length(); i++) {
				if (userFullName.charAt(i) != ' ')
					count++;
			}
			
			//this if statement prevents the System.out prompts below from printing one last time after user enters quit
			if (userFullName.equalsIgnoreCase("quit"))
				break;
			
			System.out.println("Please enter " + count + " numbers and the total will be calculated\n");
			
			//this loop adds up the inputed number from the user and will exit if user enter quit
			for (int i = 0, number; i < count && !userFullName.equalsIgnoreCase("quit"); i++) {
				
				//i+1 because i starts at 0
				System.out.print("number " + (i+1) + ": ");
				number = scan.nextInt();
				total = total + number;
			}
			
			System.out.println("\nGood day, " + userFullName + "! You have entered " + count + " numbers.\n" + 
								"The total of all the numbers is " + total + "\n");
			
			//reinitialize total and count to 0 so we can restart the program anew.
			total = 0;
			count = 0;
			
		} 
		
		System.out.println("\n\nThank you for using the system. Come back soon");
		 	
	}
	
}
