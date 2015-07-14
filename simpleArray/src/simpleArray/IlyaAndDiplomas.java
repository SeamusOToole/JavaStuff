package simpleArray;

import java.util.Scanner;

public class IlyaAndDiplomas {

	public static void main(String[] args) {
		// http://codeforces.com/problemset/problem/557/A
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of participants (between 3 and 3,000,000)");
		int numberOfStudents = sc.nextInt();
		int[][] criteria = new int[2][3];
		System.out.println("Please enter the minimum and maximum number of first type degrees seperated by a space");
		criteria[0][0] = sc.nextInt(); 
		criteria[1][0] = sc.nextInt();
		System.out.println("Please enter the minimum and maximum number of second type degrees seperated by a space");
		criteria[0][1] = sc.nextInt(); 
		criteria[1][1] = sc.nextInt();
		System.out.println("Please enter the minimum and maximum number of third type degrees seperated by a space");
		criteria[0][2] = sc.nextInt(); 
		criteria[1][2] = sc.nextInt();
		//testing
//		for(int i=0; i<2; i++){
//			for(int j=0; j<3; j++){
//				System.out.printf("Value at %d, %d is %d%n", i, j, criteria[i][j]);
//			}
//		}
		int minTotals = criteria[0][0] + criteria[0][1] + criteria[0][2];
		int maxTotals = criteria[1][0] + criteria[1][1] + criteria[1][2];
		if(minTotals > numberOfStudents || maxTotals < numberOfStudents){
			System.out.println("This is not possible. this programme will now crash");
			throw new NullPointerException();
		}
		
		for(int i=minTotals; i<numberOfStudents; ++i){
			
		}
	}
	
}
