package simpleArray;

import java.util.Random;

public class ArrayApp {

	
	public static void main(String[] args) {
		Random rand = new Random();
		int[] scores = new int[10000];
//initialise array
		for (int i = 0; i < scores.length; i++){
			scores[i] = rand.nextInt(100);
			System.out.printf("Score %d: %d%n", i, scores[i]);
		}
/*
		//get mean
		int total = 0;
		for (int i = 0; i < scores.length; i++){
			total += scores[i];
		}
		System.out.printf("\nMean: %d remainder %d", total/scores.length, total%scores.length);
*/
		//alternative (using float)
		float total2 = 0.0f;
		for (int i = 0; i <scores.length; i++){
			total2 += scores[i];
		}
		System.out.printf("\nMean: %.2f", total2/scores.length);
	
//get max
		int max = scores[0];
		for (int i = 1; i < scores.length; i++){
			if (scores[i] > max) max = scores[i];
		}
		System.out.printf("\nMax Score: %d", max);

			//get min
		int min = scores[0];
		for (int i = 1; i < scores.length; i++){
			if (scores[i] < min) min = scores[i];
		}
		System.out.printf("\nMin Score: %d\n", min);
//get mode (number that occurs most often in the list)
		int[] counter = new int[max + 1];
		for (int i = 0; i < scores.length; i++){
			counter[scores[i]]++;
		}  
		int counterMax = counter[0];
		int maxValue = 0;
		for (int i = 1; i < counter.length; i++){
			if (counter[i] > counterMax) {
				counterMax = counter[i];
				maxValue = i;
			}
		}
		System.out.printf("Mode is: %d, Max count: %d", maxValue, counterMax);
		
				
	}

}
