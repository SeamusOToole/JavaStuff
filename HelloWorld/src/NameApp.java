import java.util.Scanner;

public class NameApp {

	public static void main(String[] args) {
		//for demoing for loops
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name");
		String userInput = sc.next();
		System.out.println("How many times should the name be counted?");
		int maxCount=sc.nextInt();	
		char[] charArray = userInput.toCharArray();
		char[] newCharArray = new char[charArray.length];
		for (int i=0; i<charArray.length; i++){
			newCharArray[i] = charArray[charArray.length - i - 1];
//			System.out.println(newCharArray[i] + " " + i + " " + charArray[i]);
		}
		String newName = String.copyValueOf(newCharArray);
		for (int i=0; i<maxCount; i++){
			System.out.println(newName + " " + (i+1));
		}
		String[] names = {"Some Guy", "Other Guy", "That Guy", "Bloke"};
		for(String s: names){
			System.out.println(s);
		}

	}

}
