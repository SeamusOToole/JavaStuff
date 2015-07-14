import java.util.Scanner;

public class GradeApp2 {

	public static void main(String[] args) {
		// simple class to demonstrate the switch statement
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the grade (A, B, etc)");
		String grade = sc.next();
		grade = grade.toUpperCase();
		String result;
		switch (grade){
			case "A":  	result = "85 - 100"; 	break;
			case "B":  	result = "70 - 84"; 	break;
			case "C":  	result = "55 - 69"; 	break;
			case "D":  	result = "40 - 54"; 	break;
			default:  	result = "fail";
		}
		System.out.println(result);

	}

}
