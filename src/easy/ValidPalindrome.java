package easy;

/*
		A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and 
		removing all non-alphanumeric characters, it reads the same forward and backward. 
		Alphanumeric characters include letters and numbers.
		
		Given a string s, return true if it is a palindrome, or false otherwise.
		
		Input: s = "A man, a plan, a canal: Panama"
		Output: true
		Explanation: "amanaplanacanalpanama" is a palindrome.
			
		Input: s = "race a car"
		Output: false
		Explanation: "raceacar" is not a palindrome.
			
		Input: s = " "
		Output: true
		Explanation: s is an empty string "" after removing non-alphanumeric characters.
		Since an empty string reads the same forward and backward, it is a palindrome.
		 
	 */

public class ValidPalindrome {

	public static void main(String[] args) {
		String input1 = "A man, a plan, a canal: Panama"; // true
		String input2 = "race a car"; // false
		String input3 = " "; // true

		System.out.println(validPalindrome(input1));
		System.out.println(validPalindrome(input2));
		System.out.println(validPalindrome(input3));
	}

	private static boolean validPalindrome(String input) {
		int left = 0;
		int right = input.length() - 1;
		while (left <= right) {
			char leftSymbol = input.charAt(left);
			char rightSymbol = input.charAt(right);
			if (!isAlphaNumerical(leftSymbol)) {
				left++;
				continue;
			}
			if (!isAlphaNumerical(rightSymbol)) {
				right--;
				continue;
			}
			if (!twoSymbolsAreEquals(leftSymbol, rightSymbol))
				return false;
			left++;
			right--;
		}
		return true;
	}

	private static boolean twoSymbolsAreEquals(char leftSymbol, char rightSymbol) {
		return Character.toLowerCase(leftSymbol) == Character.toLowerCase(rightSymbol);
	}

	private static boolean isAlphaNumerical(char symbol) {
		return Character.isLetterOrDigit(symbol);
	}
}
