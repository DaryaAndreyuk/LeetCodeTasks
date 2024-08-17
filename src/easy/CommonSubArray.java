package easy;

import java.util.ArrayList;
import java.util.List;

public class CommonSubArray {

	public static void main(String[] args) {
		int[] input1 = { 1, 1, 2, 3 };
		int[] input2 = { 1, 1, 3 }; // -> [1,1,3]

		int pointer1 = 0, pointer2 = 0;
		List<Integer> output = new ArrayList<Integer>();

		while (pointer1 < input1.length && pointer2 < input2.length) {
			if (input1[pointer1] == input2[pointer2]) {
				output.add(input1[pointer1]);
				pointer1++;
				pointer2++;
			} else if (input1[pointer1] < input2[pointer2]) {
				pointer1++;
			} else {
				pointer2++;
			}
		}
		// Time Complexity: O(n + m)
		// Space Complexity: O(min(n, m))
		System.out.println(output);
	}
}
