import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// Demo the if/else statement
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		while (true){
			System.out.print("Please enter the grade achieved > ");

			String strgrade = sc.next(); 

			try{
				grade = Integer.parseInt(strgrade);
			} catch (NumberFormatException error) {
				System.out.println("Please enter an integer value between 0 and 100");
				continue;
			}

			if (grade > 100 || grade < 0){
				System.out.println("Please enter an integer value between 0 and 100");
				continue;
			}
			else if (grade >= 85){
				System.out.println("You got an A!");
			}
			else if (grade >= 70){
				System.out.println("You got a B");
			}
			else if (grade >= 55){
				System.out.println("You got a C");
			}
			else if (grade >= 40){
				System.out.println("You got a D");
			}
			else{
				System.out.println("You failed");
			}
			break;
		}
	}
}
