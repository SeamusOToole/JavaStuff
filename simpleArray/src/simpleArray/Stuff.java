package simpleArray;

public class Stuff {

	//test if a number is prime. 
	//number is prime if no value of number/smallerNumber has a remainder of 0
	//test for all values of smallerNumber < sqrt testNumber

	boolean isItPrime(int testNumber){
		for(int i = 2; i < Math.sqrt(testNumber); i++){
			if (testNumber % i == 0) return false;

		}
		return true;
	}
}
