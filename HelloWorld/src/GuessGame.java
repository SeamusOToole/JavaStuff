import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {

		String userInput;
		do{
			Scanner scan = new Scanner(System.in);
			Random randNum = new Random();
			int solutionNumber = (randNum.nextInt(20) + 1);
//			System.out.println(solutionNumber);
			int userNumber = 100;
			int guessesCount = 0;
			boolean[] previousGuesses = new boolean[20];

			/*
			 * declare boolean array previousGuesses of 20 elements(by default all values are false)
			 * get user input and store it in integer userNumber
			 * increment guess counter guessesCount by 1
			 * 
			 * if(userNumber is between values 1 and 20 inclusive)
			 * 	if(boolean value at element userNumber(minus one) in previousGuesses is false)//if user haven't picked that number
			 * 	set that element value to true
			 * 	else
			 * 	tell the user that he/she/it already made that guess AND decrement guess counter by 1
			 * else
			 * 	tell user to input values between 1 and 20 inclusive ONLY!!!
			 */

			while (userNumber != solutionNumber){
				try{
					System.out.println("Guess a number between 1 and 20 (inclusive)");
					System.out.println("Previously guessed numbers are:");
					for(int i=0; i<previousGuesses.length; ++i){
						if(previousGuesses[i]){
							System.out.print((i+1) + " ");
						}
					}
					System.out.println("\nAvailable numbers for guessing:");
					for(int i=0; i<previousGuesses.length; ++i){
						if(!previousGuesses[i]){
							System.out.print((i+1) + " ");
						}
					}
					System.out.println("");
					//userNumber = scan.nextInt();
					guessesCount ++;
					userNumber = Integer.parseInt(scan.next());
					if(userNumber > 0 && userNumber < 21){
						if(!previousGuesses[userNumber-1]){
							previousGuesses[userNumber-1] = true;
						} else {
							System.out.println("This number has already been guessed");
							--guessesCount;
						}
					}else{
						System.out.println("Only numbers between 1 and 20 are valid.");
						continue;
					}
				}catch(Exception zzz){
					System.out.println("Only numbers allowed here!!!! Please enter an integer value :)))");
					continue;
				}
				if (userNumber == solutionNumber){
					System.out.println("Congratulations! The correct number was " 
							+ solutionNumber);
					System.out.printf("You took %d guesses\n", guessesCount);
				} else{
					System.out.println("Wrong! Guess again.");

				}
			}
			//	System.out.println(userNumber);
			do{
				System.out.println("Do you wish to play again? y/n");
				userInput = scan.next();
				userInput = userInput.toUpperCase();
			}while(!userInput.equals("Y") && !userInput.equals("N"));

		}while(userInput.equals("Y"));
		System.out.println("Thank you and goodbye");
	}

}