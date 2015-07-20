package com.ocja.seamus;

import java.util.Scanner;

public class Test {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SubstitionCipher sCipher = new SubstitionCipher();
//		sCipher.initialiseArray();
		sCipher.generateKey();
		System.out.println("Enter the text to encrypt");
		String userInput = scan.nextLine();
		scan.close();
		System.out.println("Encryption key is: \n" + sCipher.toString());
		char[] cipherText = sCipher.encrypt(userInput.toCharArray());
		System.out.println("Encrypted text is: \n" + String.valueOf(cipherText));
		System.out.println("String equivalent is: \n" + sCipher.encrypt(userInput));



	}

}
