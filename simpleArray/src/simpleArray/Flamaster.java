package simpleArray;

import java.util.Scanner;

public class Flamaster {

	public static void main(String[] args) {
		//Your job is for a given word that came up with Barry, provide a shortened version of the word.
		//The first line of input contains integer C , 1 <= C <= 50 , which is the number of data sets. 
		//In the following C lines are input data sets. 
		//Each set consists of a non-empty expression composed of uppercase letters of the alphabet US. 
		//Word length does not exceed 200 characters.

		//test Strings
//		String[] testStrings = {"OPSS", "ABCDEF", "ABBCCCDDDDEEEEEFGGHIIJKKKL", "AAAAAAAAAABBBBBBBBBBBBBBBB"};

		//getting the input from the user
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("How many strings are to be checked?");
		int numberOfStrings = sc.nextInt();
		String[] testStrings = new String[numberOfStrings];
		System.out.println("Please enter the strings to be checked");
		for (int i=0; i < testStrings.length; ++i){
			testStrings[i] = sc.next();
			testStrings[i] = testStrings[i].toUpperCase();
		}
		 
		/*
		 * if character is same, keep a count and do not increment j
		 * else if character is different, do things based on value of count
		 * 			count == 1: transcribe letter and increment j
		 * 			count >1, <10: [j] gets value of count, increment j
		 * 			count >=10, <100: [j] gets count/10, j+1 gets count%10, increment j twice
		 * 			count >=100: [j] gets count/100, j+1 gets (count-100)/10, j+2 gets count%10, increment j thrice
		 * 		then reset count, new character to array, and increment j
		 * note: exceptions needed for final character
		 * 
		 */
		for (String s: testStrings){
			char[] charArray = s.toCharArray();
			char[] newCharArray = new char[s.length()]; //j is index for this array
			newCharArray[0]=charArray[0];
			for(int i=1, j=1, count=1; i<charArray.length; ++i){
				if (charArray[i] == charArray[i-1]){
					count++;
					if(i != (charArray.length -1)){
						continue;
					}
				}
				if (count == 1){
				}else if (count == 2){
					newCharArray[j] = charArray[i-1];
					++j;
				}else if (count < 10){
					newCharArray[j] = Character.forDigit(count, 10);
					++j;
				}else if (count < 100){
					newCharArray[j] = Character.forDigit(count/10, 10);
					newCharArray[j+1] = Character.forDigit(count%10, 10);
					j+=2;
				}else{
					newCharArray[j] = Character.forDigit(count/100, 10);
					newCharArray[j+1] = Character.forDigit((count-count%10)/10%10, 10);
					newCharArray[j+2] = Character.forDigit(count%10,  10);
					j+=3;
				}
				if(i != (charArray.length -1) || (charArray[i] != charArray[i-1])){
					newCharArray[j] = charArray[i]; 
				}
				count = 1; 
				++j;
			}
			System.out.println(String.valueOf(newCharArray));
		}

	}

}
