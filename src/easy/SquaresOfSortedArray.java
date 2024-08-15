package easy;

public class SquaresOfSortedArray {
	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array
	 * of the squares of each number sorted in non-decreasing order.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Example 2:
	 * 
	 * Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums is sorted in
	 * non-decreasing order.
	 * 
	 */

	public static void main(String[] args) {
		int[] nums = { -20, -1, 0, 0, 3, 10 };
		int[] output = squareSortedArray(nums);
		print(output);

	}

	private static void print(int[] output) {
		for (int out : output)
			System.out.print(out + " ");

	}

	private static int[] squareSortedArray(int[] nums) {
		int[] output = new int[nums.length];
		int left = 0;
		int right = nums.length - 1;
		int index = nums.length - 1;

		while (left <= right) {
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];
			if (leftSquare > rightSquare) {
				output[index] = leftSquare;
				left++;
			} else {
				output[index] = rightSquare;
				right--;
			}
			index--;
		}
		return output;
	}

}
