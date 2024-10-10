package easy.removeduplicates;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Integer[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int[] expectedNums = { 0, 1, 2, 3, 4 };

		int k = removeDuplicates(nums);

		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
			assert nums[i] == expectedNums[i];
		}
		printNums(nums, k);
	}

	private static void printNums(Integer[] nums, int k) {
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
			;
		}
	}

	private static int removeDuplicates(Integer[] nums) {
		int start = 0;
		int finish = 0;
		int numOfDuplicates = 0;
		int sumNumOfDuplicates = 0;
		for (int i = 1; i < nums.length - sumNumOfDuplicates; i++) {
			if ((nums[i] != null) && (nums[start] == nums[i]) && i != nums.length - sumNumOfDuplicates - 1) {
				finish += 1;
			} else {
				if (i == nums.length - sumNumOfDuplicates - 1)
					numOfDuplicates = finish - start + 1;
				else
					numOfDuplicates = finish - start;
				moveElements(nums, i, numOfDuplicates);
				i = i - numOfDuplicates;
				start = i;
				finish = i;
				sumNumOfDuplicates += numOfDuplicates;
			}
		}
		return nums.length - sumNumOfDuplicates;
	}

	private static void moveElements(Integer[] nums, int i, int numOfDuplicates) {
		for (int j = i; j < nums.length; j++) {
			nums[j - numOfDuplicates] = nums[j];
		}
		for (int j = 1; j <= numOfDuplicates; j++) {
			nums[nums.length - j] = null;
		}
	}
}
