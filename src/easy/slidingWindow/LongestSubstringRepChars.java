package easy.slidingWindow;

import java.util.HashSet;
import java.util.Set;

/*
 * Given a string s, find the length of the longest substring  without repeating characters.

	Example 1:
	
	Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	
	Example 2:
	
	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
	
	Example 3:
	
	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 
 */

public class LongestSubstringRepChars {

	public static void main(String[] args) {
		String input = "abcabcbb";
		int output = longSubstringRepChars(input);
		System.out.println(output);
	}

	private static int longSubstringRepChars(String input) {
        Set<Character> charSet = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            // If the character is already in the set, remove the leftmost character(s) until it's not
            while (charSet.contains(currChar)) {
                charSet.remove(input.charAt(start));
                start++;
            }
            charSet.add(currChar);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}
