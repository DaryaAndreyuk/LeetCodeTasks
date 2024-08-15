package easy;

public class MoveZeroes {

	// Given an integer array nums, move all 0's to the end of it while maintaining
	// the relative order of the non-zero elements.

	// Note that you must do this in-place without making a copy of the array.

	// Example 1:

	// Input: nums = [0,1,0,3,12]
	// Output: [1,3,12,0,0]
	// Example 2:

	// Input: nums = [0]
	// Output: [0]

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		printArray(nums);
	}

	public static void moveZeroes(int[] nums) {
		int zeroCount = 1;
		for (int num : nums)
			if (num == 0)
				zeroCount++;

		while (zeroCount > 0) {
			for (int i = 0; i < nums.length - 1; i++) {
				if (nums[i] == 0) {
					nums[i] = nums[i + 1];
					nums[i + 1] = 0;
				}
			}
			zeroCount--;
		}

	}

	private static void printArray(int[] nums) {
		for (int k = 0; k <= nums.length - 1; k++) {
			System.out.print(nums[k] + " ");
		}
	}

}
