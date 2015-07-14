package simpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class SchoolMarks {

	public static void main(String[] args) {
		boolean success = false;
		Scanner sc = new Scanner(System.in);
		int[] successCriteria = new int[5];
		System.out.println("Please enter the success criteria for the tests as described in the design spec");
		for(int i=0; i<successCriteria.length; ++i){
			successCriteria[i] = sc.nextInt();
		}
		System.out.printf("Please enter the marks achieved in the first %d tests%n", successCriteria[1]);
		int[] achievedMarks = new int[successCriteria[0]];
		Arrays.fill(achievedMarks, 1);
		for(int i=0; i<successCriteria[1]; ++i){
			achievedMarks[i]= sc.nextInt();
		}
		//Test the arrays are populating correctly
		//		for(int i=0; i<successCriteria.length; ++i){
		//			System.out.print(successCriteria[i] + " ");
		//		}
		//		for(int i=0; i<achievedMarks.length; ++i){
		//			System.out.print(achievedMarks[i] + " ");
		//		}
		/*
		 * minimum median point of final results is 'y' (successCriteria[4])
		 * maximum total marks that can be achieved is 'x' (successCriteria[3])
		 * achievedMarks is an array of size 'n', the first 'p' elements of which contain the previous marks
		 * 		the rest of its elements are set to 1
		 * 
		 * pseudocode
		 * 0) sort the array
		 * 1) calculate the current median
		 * 2) if this meets the criteria for success, *stuff*
		 * 3) else change one of the new numbers to 'y' and repeat the sort/median
		 * 		keep track of how many times we do this
		 * 4) *stuff* count the total in achievedMarks, 
		 * 		if this meets the success criteria, output the results as a list of 1s and 'y's
		 * 		else output -1 
		 */
		int count = 0;
		for(int i=0; i<(successCriteria[0]-successCriteria[1]); i++){
			int[] sortedArray = Arrays.copyOf(achievedMarks, achievedMarks.length);
			Arrays.sort(sortedArray);
			int median = sortedArray[(sortedArray.length - 1)/2];
			if(median >= successCriteria[4]){
				int total=0;
				for(int j=0; j<achievedMarks.length; j++){
					total += achievedMarks[j];
				}
				if(total<=successCriteria[3]) success = true;
				break;
			} 
			achievedMarks[successCriteria[1]+i] = successCriteria[4];
			count++;
		}
		if(success){
			for(int i=successCriteria[1]; i<achievedMarks.length; ++i){
				System.out.print(achievedMarks[i] + " ");
			}
		}else {
			System.out.print("-1");
		}

	}

}
