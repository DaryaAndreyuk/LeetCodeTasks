package easy;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int target = 9;
		int[] nums = { 2, 7, 11, 17 };
		int[] output = twoSum(nums, target);
		System.out.println("[" + output[0] + ", " + output[1] + "]");
	}

	public static int[] twoSum(int[] nums, int target) {

		// Map to store (number, index) pairs
		Map<Integer, Integer> map = new HashMap<>();

		// Iterate through the array
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			// Check if complement exists in the map
			if (map.containsKey(complement)) {
				// Return indices of the two numbers
				return new int[] { map.get(complement), i };
			}
			// Put current number and its index into the map
			map.put(nums[i], i);
		}

		// If no such pair is found, throw exception or handle as required
		throw new IllegalArgumentException("No two sum solution");
	}

}
