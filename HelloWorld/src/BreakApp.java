import java.util.Scanner;

public class BreakApp {

	public static void main(String[] args) {
		//simple App to demonstrate break 
		System.out.println("Break App");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the integer you wish to find");
		int userInput = sc.nextInt();
		sc.close();
		for(int i = 1; i<=100; ++i){
			if(i == userInput){
				System.out.println(i + " Found it!");
				break;
			} else {
				for(int j = 0; j<10; ++j){
					if(0==j){
						System.out.println(i);
					} else {
						System.out.println(i+"."+j);
					}
				} 
			}
		}

	}

}
