package simpleArray;

import java.util.Scanner;

public class ArrayStuff2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
//		System.out.println("test enter a number");
//		int testScan = userInput.nextInt();
//		System.out.println(testScan);
		System.out.println("How many numbers to you want to test?");
		int arraySize = userInput.nextInt();
		
		int[] array = new int [arraySize];
		
		label:
			for (int i = 0; i < array.length; i++){
				for(int j = 2; j < Math.sqrt(i); j++){
					if (i % j == 0){
						System.out.printf("%d is not prime\n", i);
						continue label;
					}

				}
				System.out.printf("%d is prime\n", i);

			}

		}


}
