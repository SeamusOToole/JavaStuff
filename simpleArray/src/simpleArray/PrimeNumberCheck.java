package simpleArray;

import java.util.Scanner;

public class PrimeNumberCheck {


	public static void main(String[] args) {
		// Task: take numbers from keyboard input and determine if those numbers are prime. 

		Scanner userInput = new Scanner(System.in);
		System.out.println("How many numbers to you want to test?");
//		int arraySize = userInput.nextInt();
//		int[] array = new int [arraySize];
		int[] array = new int [userInput.nextInt()]; //combines the above two lines. Not sure if good practice. 
		System.out.println("Please enter the numbers to be tested");
		for (int i = 0; i < array.length; i++){
			array[i] = userInput.nextInt();
		}

		label:
			for (int i = 0; i < array.length; i++){
				for(int j = 2; j <= Math.sqrt(array[i]); j++){
					if (array[i] % j == 0){
						System.out.printf("%d is not prime. It's lowest prime factor is %d. \n", array[i], j);
						continue label;
					}
				}
				System.out.printf("%d is prime\n", array[i]);
			}
	}
}
