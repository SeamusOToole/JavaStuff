package simpleArray;

import java.util.Scanner;

public class TestingAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[5];
		for(int i = 0; i < input.length; ++i){
			input[i] = sc.nextInt();
		}
		for(int i = 0; i< 5; ++i){
		System.out.println(input[i]);
		}

	}

}
