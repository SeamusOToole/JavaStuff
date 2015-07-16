import java.util.Scanner;
// testing that I can upload from laptop and see on other. 
public class ReturnApp {

	private boolean isEven (int testNumber){
		return(testNumber%2==0);
	}

	private boolean isPrime (int testNumber){
		for(int i=2; i<=Math.sqrt(testNumber); i++){
			if(testNumber%i == 0){
				return false;
			}
		}
		return true;
	}

	// This would probably be tidier with an ArrayList
	// But I think better to wait until we do ArrayList properly, not try to mess around with it 
	private int[] factors (int testNumber){
		int[] factorArray = new int[testNumber];
		int numFactors=0;
		for (int i=1; i<=testNumber; ++i){		
			if(testNumber%i==0){
				factorArray[numFactors++] = i;
			}
		}
		return this.trimArray(factorArray, 0);
	}

	/*
	 * to find prime factors
	 * 1) find the smallest factor of the input number (min 2)
	 * 2) divide the number by this factor to get newNumber and save the factor to an array
	 * 3) repeat 1 and 2 on the newNumber until we get a prime number for newNumber
	 */
	private int[] primeFactors(int testNumber){
		int[] workingArray = new int[(int)(Math.sqrt(testNumber))+1];
		label:
			for(int j=0; j<workingArray.length; ++j){
				for(int i=2; i<testNumber; ++i){
					if(testNumber%i==0){
						workingArray[j] = i; 
						testNumber/=i;
						continue label;
					}
				}
				workingArray[j]=testNumber;
				break;
			}
		return this.trimArray(workingArray, 0);
	}

	private int[] trimArray(int[] inputArray, int numberToTrim){
		//accepts an array of int, returns a similar array where all cells containing a specified number have been removed 
		int resultArrayLength = inputArray.length;
		for (int i=0; i<inputArray.length; ++i){
			if (inputArray[i] == numberToTrim){
				resultArrayLength--;
			}
		}
		int[] resultArray = new int[resultArrayLength];
		for (int i=0, j=0; i<inputArray.length; ++i){
			if (inputArray[i] != numberToTrim){
				resultArray[j++] = inputArray[i];
			}
		}
		return resultArray;
	}

	public static void main(String[] args) {
		// demo the return statement
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the value to be tested:\n >");
		int userInput = sc.nextInt();
		ReturnApp myReturnApp = new ReturnApp();
		sc.close();
		System.out.println("Even?: " + myReturnApp.isEven(userInput));
		System.out.println("Prime?: " + myReturnApp.isPrime(userInput));
		int[] testArray =  myReturnApp.factors(userInput);
		System.out.printf("%d has %d factors, they are%n ", userInput, testArray.length);
		for (int i=0; i<testArray.length; ++i){
			System.out.print(testArray[i] + " ");
		}
		System.out.printf("\nThe prime factors of %d are%n ", userInput);
		int[] primeFactors = myReturnApp.primeFactors(userInput);
		for (int i=0; i<primeFactors.length; ++i){
			System.out.print(primeFactors[i] + " ");
		}

	}
}
