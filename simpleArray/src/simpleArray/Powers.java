package simpleArray;

import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		//		reads from the standard input: the basis for a and exponent b ,
		//		designates the last digit of the number a ^ b ,
		//		writes the result to standard output.

		//		note that as we are only interested in the last digit of the final result, 
		//		we only need to do the exponent on the last digit of the input
		//		this is relevant for large bases which may otherwise overflow the variable. 


		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you wish to consider?");
		int arraySize = sc.nextInt();
		int[][] array = new int[4][arraySize];
		//array 0 is original base, 1 is single digit base, 2 is exponent, 3 is output
		for (int i = 0; i < arraySize; i++){
			System.out.printf("Please enter the base (a) for pair %d: ", i+1);
			array[0][i] = sc.nextInt();
			array[1][i] = array[0][i];
			while (array[1][i] > 100){
				array[1][i] = array[1][i] - 100;
			}
			while (array[1][i] > 10){
				array[1][i] = array[1][i] - 10;
			}

			array[3][i] = array[1][i];
			System.out.printf("Please enter the exponent (b) for pair %d: ", i+1);
			array[2][i] = sc.nextInt();

			for (int j = 1; j < array[2][i]; j++){
				array[3][i] = array[3][i] * array[1][i];
				while (array[3][i] > 10){
					array[3][i] = (array[3][i] - 10);
				}

			}

		}
		for (int i = 0; i < arraySize; i++){
			System.out.printf("%nThe final digit in the result of %d^%d is %d.", array[0][i], array[2][i], array[3][i]);
		}
	}

}
