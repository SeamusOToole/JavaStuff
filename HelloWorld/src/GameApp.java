import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many lives would you like to start with?");
		String tempString = sc.next();
		
		int numGames = sc.nextInt();
		if(numGames < 1){
			System.out.println("cannot initialise with 0 lives or less remaining");
			numGames =1;
		}
		while (numGames != 0){
			//do stuff
			numGames--;
		}
		System.out.println("Game Over");
				

	}

}
