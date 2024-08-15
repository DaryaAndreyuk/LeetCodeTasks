package easy;

import java.util.Stack;

/*
 * Given two strings s and t, return true if they are equal when both are typed
 * into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 * Example 1:
 * 
 * Input: s = "ab#c", t = "ad#c" Output: true Explanation: Both s and t become
 * "ac". Example 2:
 * 
 * Input: s = "ab##", t = "c#d#" Output: true Explanation: Both s and t become
 * "". Example 3:
 * 
 * Input: s = "a#c", t = "b" Output: false Explanation: s becomes "c" while t
 * becomes "b".
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length, t.length <= 200 s and t only contain lowercase letters and '#'
 * characters.
 */

public class BackSpaceStringCompare {
	public static void main(String[] args) {
		String input1 = "ffb##";
		String input2 = "c#d#";
		System.out.println(backSpaceStringCompare(input1, input2));

	}

	private static boolean backSpaceStringCompare(String input1, String input2) {
		// Solution 1 with Stacks
		Stack<Character> updatedInput1 = removeSubStringWithStack(input1);
		Stack<Character> updatedInput2 = removeSubStringWithStack(input2);
		// return updatedInput1.equals(updatedInput2);

		// Solution 2
		String updatedInput3 = removeSubStringWithoutStack(input1);
		String updatedInput4 = removeSubStringWithoutStack(input2);

		return updatedInput3.equals(updatedInput4);
	}

	private static String removeSubStringWithoutStack(String input) {
		StringBuilder resultBuilder = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char symbol = input.charAt(i);
			if (symbol == '#') {
				if (resultBuilder.length() > 0)
					resultBuilder.deleteCharAt(resultBuilder.length() - 1);
			} else
				resultBuilder.append(symbol);
		}
		return resultBuilder.toString();
	}

	private static Stack<Character> removeSubStringWithStack(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char symbol = input.charAt(i);
			if (symbol != '#') {
				stack.push(symbol);
			} else if (!stack.isEmpty())
				stack.pop();

		}
		return stack;

	}

}
