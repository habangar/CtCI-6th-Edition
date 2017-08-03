package Q1_04_Palindrome_Permutation;

/*
Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or
phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome
does not need to be limited to just dictionary words.

Assumption 1: A palindrome does not have more than 1 letter that occurs an odd number of times
Assumption 2: I will disregard spaces, so that "taco cat" is a permutation of the palindrome "tacocat"
Assumption 3: I will disregard cases, so that "Taco CAt" is a permuattion of the palindrome "tACo caT"
*/
public class QuestionA {	
	public static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}
	
	public static boolean isPermutationOfPalindrome(String phrase) {
		int[] table = Common.buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}
	
	public static void main(String[] args) {
		String pali = "Rats live on no evil star";
		System.out.println(isPermutationOfPalindrome(pali));
	}


}
