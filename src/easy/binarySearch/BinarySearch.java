package easy.binarySearch;

// Given an array of integers nums which is sorted in ascending order, and an integer target, 
// write a function to search target in nums. If target exists, then return its index. 
// Otherwise, return -1.

// You must write an algorithm with O(log n) runtime complexity.

public class BinarySearch {

	public static void main(String[] args) {
		/*
		 * Input: nums = [-1,0,3,5,9,12], target = 9 Output: 4 Explanation: 9 exists in
		 * nums and its index is 4
		 * 
		 * Input: nums = [-1,0,3,5,9,12], target = 2 Output: -1 Explanation: 2 does not
		 * exist in nums so return -1
		 */

		int[] input = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        int result = binarySearch(input, target);
        System.out.println(result); // Output: 4

        int[] input1 = { -1, 0, 3, 5, 9, 12 };
        int target1 = 2;
        int result1 = binarySearch(input1, target1);
        System.out.println(result1); // Output: -1
	}

	private static int binarySearch(int[] input, int target) {
		int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents potential overflow

            if (input[mid] == target) {
                return mid; // Target found
            } else if (input[mid] < target) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Target not found
    }

}
