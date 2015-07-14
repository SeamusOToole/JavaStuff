import java.util.Random;
import java.util.Scanner;

public class CompundApp {

	public static void main(String[] args) {
		// Simple class to demonstrate compound operators 
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int userInput = scan.nextInt();
//		System.out.println("initial value = " + userInput);
//		userInput += 1;
//		System.out.println("adding one we get " + userInput);
//		userInput -= 1; 
//		System.out.println("subtracting 1 we get " + userInput);

		//Use the other compound assignment operators to accomplish a task(s) you deem an appropriate use.
		int currentHealth = 100;
		int hitsTaken = 0;
		Random rand = new Random();
		while (currentHealth > 0){
			currentHealth -= rand.nextInt(20);
			hitsTaken++;
			System.out.printf("You have been hit %d times and your health is now %d%n", hitsTaken, currentHealth);
		}
		
	}

}
