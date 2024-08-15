package easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		/*
		 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
		 * ']', determine if the input string is valid.
		 * 
		 * An input string is valid if:
		 * 
		 * Open brackets must be closed by the same type of brackets. Open brackets must
		 * be closed in the correct order. Every close bracket has a corresponding open
		 * bracket of the same type. Example 1:
		 * 
		 * Input: s = "()" Output: true Example 2:
		 * 
		 * Input: s = "()[]{}" Output: true Example 3:
		 * 
		 * Input: s = "(]" Output: false
		 */

		String input = "()";
		String input1 = "()[]{}";
		String input2 = "(]";
		System.out.println(isValid(input));
		System.out.println(isValid(input1));
		System.out.println(isValid(input2));

	}

	public static boolean isValid(String input) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			char p = input.charAt(i);
			if (p == '{' || p == '[' || p == '(') {
				stack.push(p);
			} else if (p == '}' || p == ']' || p == ')') {
				if (stack.isEmpty())
					return false;
				else {
					char peek = stack.peek();
					if ((peek == '{' && p == '}') || (peek == '[' && p == ']') || (peek == '(' && p == ')')) {
						stack.pop();
					} else {
						return false;
					}
				}

			}
		}
		return stack.isEmpty();
	}

}
