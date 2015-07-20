/*
 * Implementation of a basis substitution cipher. 
 * 
 * @author Seamus O'Toole
 */
package com.ocja.seamus;

import java.util.Arrays;
import java.util.Random;

public class SubstitionCipher {
	Random rand = new Random();
	private char[] cipherKey = new char[52];
	private final static char[] plainArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 
			't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
			'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	
	private char[] shuffleArray(char[] source){
		char[] destination = new char[source.length];
		for (int i=0; i<destination.length; ++i){
			int r = rand.nextInt(source.length-i);
			for (int j=0, k=0; j<source.length; ++j){
				if (k==r && source[j]!=0){
					destination[i]=source[j];
					source[j] = 0;
					break;
				} else if (source[j] != 0){
					++k;
				}
			}
		}
		return destination;
	}
	
	void generateKey(){
		char[] tempArray = Arrays.copyOf(plainArray, 26);
		tempArray = this.shuffleArray(tempArray);
		for (int i=0; i<26; ++i){
			cipherKey[i]=tempArray[i];
			cipherKey[i+26]=(char)(tempArray[i]-32);
		}
	}
	
	void setKey(String key){
		cipherKey = key.toCharArray();
	}
	
	String encrypt(String plainText){
		char[] cipherText = new char[plainText.length()];
		for (int i=0; i<cipherText.length; ++i){
			cipherText[i]=plainText.charAt(i);
			for (int j=0; j<cipherKey.length; ++j){
				if (plainText.charAt(i) == plainArray[j]){
					cipherText[i] = cipherKey[j];
					break;
				}
			}
		}
		return String.valueOf(cipherText);
	}
	
	char[] encrypt(char[] plainText){
		char[] cipherText = new char[plainText.length];
		for (int i=0; i<plainText.length; ++i){
			cipherText[i]=plainText[i];
			for (int j=0; j<cipherKey.length; ++j){
				if (plainText[i] == plainArray[j]){
					cipherText[i] = cipherKey[j];
					break;
				}
			}
		}
		return cipherText;
	}
	
	String decrypt(String cipherText){
		char[] plainText = new char[cipherText.length()];
		for (int i=0; i<plainText.length; ++i){
			plainText[i]=cipherText.charAt(i);
			for (int j=0; j<cipherKey.length; ++j){
				if (cipherText.charAt(i) == cipherKey[j]){
					plainText[i] = plainArray[j];
					break;
				}
			}
		}
		return String.valueOf(plainText);
	}
	
	char[] decrypt(char[] cipherText){
		char[] plainText = new char[cipherText.length];
		for (int i=0; i<plainText.length; ++i){
			plainText[i]=cipherText[i];
			for (int j=0; j<cipherKey.length; ++j){
				if (cipherText[i] == cipherKey[j]){
					plainText[i] = plainArray[j];
					break;
				}
			}
		}
		return plainText;
	}
	
	public String toString(){
		return String.valueOf(cipherKey);
	}
	
}
