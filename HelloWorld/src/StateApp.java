import java.util.Scanner;


public class StateApp {

	public static void main(String[] args) {
		// increment and decrement variables
		String userName;
		int userAge = 0;
		String menuChoice;
		Scanner sc = new Scanner(System.in);
		while (true){
			System.out.println("Please choose an option: \n 1) input name \n 2) input age \n 3) quit");
			menuChoice = sc.next();
			//			menuChoice = sc.nextInt();
			if (menuChoice.startsWith("1", 0) && (menuChoice.length() == 1)){
			System.out.println("Please enter your name>");
				userName = sc.next();
				System.out.println("Your name is " + userName);
			}
			else if (menuChoice.startsWith("2", 0) && (menuChoice.length() == 1)){
				//			else if (menuChoice == 2){
				System.out.println("Please enter your age>");
				userAge = sc.nextInt();
				if (userAge >= 18 && userAge < 200){
					System.out.println("Your age is " + userAge);
				}
				else{
					System.out.println("Your age will not be displayed");
				}
			} 
			else if (menuChoice.startsWith("3", 0) && (menuChoice.length() == 1)){
				//else if (menuChoice == 3){
				System.out.println("Thank you, goodbye!");
				break;
			}

			else {
				System.out.println("invalid choice");
			}
		}
		/*System.out.println("Please enter your age: ");
		userAge = sc.nextInt();

		//stateApp = 20;
		System.out.println("first printed age: " + userAge);
		System.out.println("increment age: " + ++userAge);
		System.out.println("decrement age: " + --userAge);
		System.out.println("postincrement age: " + userAge++);
		System.out.println("postdecrement age: " + userAge--);

		if (userAge >= 18 && userAge < 200){
			System.out.println("Confirmed valid age: " + userAge);
		} 
		else {
			System.out.println("Age outside the valid age range.");
		}
		 */

	}

}			
