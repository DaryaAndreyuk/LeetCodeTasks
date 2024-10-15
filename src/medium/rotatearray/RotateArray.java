package medium.rotatearray;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		// 1 2 3 4 5 6 7
		// 7 6 5 4 3 2 1
		// output: [5,6,7,1,2,3,4]

		int[] output = rotateArray(nums, k);
		printArray(output);

		int[] nums1 = { 1, 2, 3 };
		int k1 = 1;

		int[] output1 = rotateArray(nums1, k1);
		printArray(output1);

	}

	private static void printArray(int[] output) {
		for (int i = 0; i < output.length; i++)
			System.out.print(output[i] + " ");
		System.out.println();
	}

	private static int[] rotateArray(int[] nums, int k) {
	    int length = nums.length;
	    k = k % length; // Adjust k if greater than length
	    if (k == 0) {
	        return nums; // No rotation needed
	    }

	    // Reverse the whole array
	    for (int i = 0; i < length / 2; i++) {
	        int temp = nums[i];
	        nums[i] = nums[length - i - 1];
	        nums[length - i - 1] = temp;
	    }

	    // Reverse the first k elements
	    for (int i = 0; i < k / 2; i++) {
	        int temp = nums[i];
	        nums[i] = nums[k - i - 1];
	        nums[k - i - 1] = temp;
	    }

	    // Reverse the remaining elements from k to the end
	    for (int i = k; i < (length + k) / 2; i++) {
	        int temp = nums[i];
	        nums[i] = nums[length - (i - k) - 1];
	        nums[length - (i - k) - 1] = temp;
	    }

	    return nums;
	}

}