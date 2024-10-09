package easy.removeduplicates;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 }; // Input array
		int[] expectedNums = { 0, 1, 2, 3, 4 }; // The expected answer with correct length

		int k = removeDuplicates(nums); // Calls your implementation

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
			assert nums[i] == expectedNums[i];
		}
	}

	private static int removeDuplicates(int[] nums) {
		int[] output = new int[nums.length];
		int start = 0;
		int finish = 0;
		int currentIndex = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[start] == nums[i]) {
				finish += 1;
			} else {
				start = i;
				finish = i;
				output[currentIndex] = nums[i - 1];
				currentIndex += 1;
			}
		}
		return output.length;
	}

}
