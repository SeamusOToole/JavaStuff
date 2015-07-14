package simpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class CommonFactorsV2 {

	public static void main(String[] args) {
		// Given 2 integer inputs, find the highest common factor of the two numbers. 

		Scanner sc = new Scanner(System.in);
		System.out.println("How many pairs do you wish to check?");
		int 
		System.out.println("Please enter number pair %d, seperated by a space");
		int[] userInputs = new int[2];
		userInputs[0] = sc.nextInt();
		userInputs[1] = sc.nextInt();
		Arrays.sort(userInputs);
		int[] factors = new int[userInputs[1]/2];
		Arrays.fill(factors, 1);
		for(int i=0, j=0; i<factors.length; ++i){
			if(userInputs[1]%(i+2) == 0){
				factors[j] = userInputs[1]/(i+2);
				j++;
			}
		}
		int result = 1;
		for(int i=0; i<factors.length; i++){
			if(userInputs[0]%factors[i] == 0){
				result = factors[i];
				break;
			}
		}
		System.out.printf("The highest common factor of %d and %d is %d", userInputs[1], userInputs[0], result);
	}
}
