import java.util.Scanner;

public class ContinueApp {

	public static void main(String[] args) {
		// simple App to demonstrate the continue statement
		System.out.println("Continue App");
		//print out all odd numbers between 10 and 100
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to print odd or even numbers?");
		System.out.println("Select 1 for odd or 2 for even.");
		int userChoice = sc.nextInt();
		
		for(int i=10; i<=100; ++i){
			if((i-userChoice)%2 !=0){
				continue;
			} else {
				System.out.println(i);
			}
		}
		//without continues
//		for(int i=10; i<=100; ++i){
//			if(i%2 != 0){
//				System.out.println(i);
//			}
//		}
	}
}
