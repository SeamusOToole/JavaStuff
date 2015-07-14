package simpleArray;

import org.omg.Messaging.SyncScopeHelper;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 123; 
		char[] cde = new char[3];
		cde[0] = Character.forDigit(test/100, 10);
		cde[1] = Character.forDigit((test-test%10)/10%10, 10);
		cde[2] = Character.forDigit(test%10, 10);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		String s = String.valueOf(cde);
		System.out.println(s);
		
		int factTest = 4; 
		int resultTest = 1;
		for (int i = 1; i<=factTest; i++){
			resultTest*=i;
		}
		System.out.println(resultTest);
		
		int[] sortedArray = {1, 1, 3, 5, 5, 6, 6};
		int median = sortedArray[(sortedArray.length - 1)/2];
		System.out.println(median);
	}
	
	
}
