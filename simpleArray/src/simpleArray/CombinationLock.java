package simpleArray;

import java.util.Arrays;
import java.util.Scanner;

public class CombinationLock {

	public static void main(String[] args) {
		// http://codeforces.com/problemset/problem/540/A
		// get user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of disks on the lock");
		int numberOfGears = sc.nextInt();
		System.out.printf("please enter the original state of all %d disks\n", numberOfGears);
		String inputStartState = sc.next();
		System.out.printf("please enter the desired final state of all %d disks\n", numberOfGears);
		String inputSolutionState = sc.next();
		//declare the integer arrays that we'll use for the actual calculations
		int[] startState = new int[inputStartState.length()];
		int[] solutionState = new int[inputSolutionState.length()];
		//populate the integer arrays
		for(int i=0; i<startState.length; ++i){
			startState[i] = Character.getNumericValue(inputStartState.charAt(i));
			solutionState[i] = Character.getNumericValue(inputSolutionState.charAt(i));
		}
		//calculations
		int numberOfMoves=0;
		for(int i=0; i<startState.length; ++i){
			int[] noIfStatements = {Math.abs(startState[i]-solutionState[i]), (startState[i]-solutionState[i] + 10), 
					(solutionState[i] - startState[i] + 10)};
			Arrays.sort(noIfStatements);
			numberOfMoves+=noIfStatements[0];
		}
		System.out.printf("Required number of moves is %d", numberOfMoves);
	}
}
