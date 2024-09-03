package easy.slidingWindow;

/*
 * You are given an integer array nums consisting of n elements, and an integer k.

	Find a contiguous subarray whose length is equal to k that has the maximum 
	average value and return this value. Any answer with a calculation error less than 10^(-5) will be accepted.

	Example 1:

	Input: nums = [1,12,-5,-6,50,3], k = 4
	Output: 12.75000
	Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

	Example 2:

	Input: nums = [5], k = 1
	Output: 5.00000
 */

public class MaxAveSubarray1 {

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double expectedOutput = 12.75000;
        double actualOutput = maxAveSubarray(nums, k);
        System.out.println(actualOutput);

        // Optional: Asserting the output
        assert Math.abs(actualOutput - expectedOutput) < 1e-5 : "Test failed!";
    }

    private static double maxAveSubarray(int[] nums, int k) {
        int length = nums.length;
        if (length < k) {
            throw new IllegalArgumentException("Array length must be at least k");
        }

        double sum = 0.0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxAverage = sum / k;

        for (int i = k; i < length; i++) {
            sum = sum - nums[i - k] + nums[i];
            double currentAverage = sum / k;
            maxAverage = Math.max(maxAverage, currentAverage);
        }

        return maxAverage;
    }
}
