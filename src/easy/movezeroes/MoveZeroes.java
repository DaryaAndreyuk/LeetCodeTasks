package easy.movezeroes;

import basic.UtilClass;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1 };

		int[] outputExpected = { 1, 3, 12, 0, 0 };
		int[] outputActual = moveZeroes(nums);
		UtilClass.printArray(outputActual);

	}

	private static int[] moveZeroes(int[] nums) {
		int currentIndex = 0;
		int length = nums.length;

		for (int i = 0; i < length; i++) {
			if (nums[i] != 0) {
				nums[currentIndex] = nums[i];
				currentIndex += 1;
			}
		}
		int numberOfZeroes = length - currentIndex;
		for (int i = currentIndex; i < length; i++) {
			nums[i] = 0;
		}
		return nums;
	}

}
