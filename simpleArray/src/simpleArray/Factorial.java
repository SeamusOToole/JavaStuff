package simpleArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * The first line of input there is one number a completely D ( 1 < D <30), ---- number of cases to consider. 
		 * The description of each event consists of a single line, 
		 * in which the one non-negative integer n (0 < n < 1 000 000 000). 
		 * The output for each input case. 
		 * Your program should write a separate line exactly two numbers (separated by a space) 
		 * and the tens digit number unity of the number n! stored in decimal.
		 * 
		 */

		// 1) get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to calculate the factorial of?");
		int arraySize = sc.nextInt();
		int[] userInput = new int[arraySize];
		for(int i=0; i<userInput.length; ++i){
			System.out.printf("Number (%d) > ", (i+1));
			userInput[i] = sc.nextInt();
		}
		// 2) calculate factorial of each number
		int[] results = new int[arraySize];
		Arrays.fill(results, 1);
		for(int i = 0; i<userInput.length; ++i){
			if(userInput[i] > 10){ //as final output is only last two digits, this keeps us from exceeding the capacity of int 
				results[i] = 100;  //the factorial of any number ten or higher ends with 00
			}else{
				for(int j=1; j<=userInput[i]; ++j){
					results[i]*=j;
				}
			}
//			System.out.printf("%d factorial is %d%n", userInput[i], results[i]); //test output
			// 3) change output to only show the tens and digits of the answer, separated by a space.
			System.out.println((results[i]-results[i]%10)/10%10 + " " + results[i]%10);
		}
	}

}
