import java.util.Scanner;

public class OperatorApp {

	public static void main(String[] args) {
		// Simple class to demonstrate operators
		
//		String name = "some guy";
//		int age = 33;
//		boolean isAlive = false;
//		byte familySize = 5;
//		float height = 1.82f;
//		double weight = 57.65;
//		char gender = 'm';
		
		char someChar = '\u0021';
//		System.out.println(someChar);
		for (int i=0; i<140; i++){
			if(i%10==0){
				System.out.println("");
			}
			System.out.print(someChar + " ");
			someChar++;
		}
		System.out.println("\nplease enter 2 characters sequentially with no spaces");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		sc.close();
		char firstChar = input.charAt(0);
		char secondChar = input.charAt(1);
		if(firstChar > secondChar){
			System.out.println(firstChar + " " + secondChar);
		} else {
			System.out.println(secondChar + " " + firstChar);
		}

	}

}
