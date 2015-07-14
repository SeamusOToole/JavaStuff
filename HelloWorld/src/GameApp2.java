import java.util.Random;
import java.util.Scanner;

public class GameApp2 {

	public static void main(String[] args) {

		System.out.println("Begin Game");
		boolean isPlaying = true;
		int hitPoints = 100;
		int killCount = 0;

		do{
			Scanner sc = new Scanner(System.in);
			Random rand = new Random();
			System.out.println("Please select from the following options:");
			System.out.println("1: Start a new game");
			System.out.println("2: Continue current game");
			System.out.println("3: quit");
			System.out.print("> ");
			int userChoice = sc.nextInt(); 
			switch (userChoice){
				case 1: hitPoints = 100;
				killCount = 0;
				case 2: hitPoints -= rand.nextInt(20);
				killCount++;
				break;
				case 3: isPlaying = false; 
				break;
			}

		}while (isPlaying);
	}

}
