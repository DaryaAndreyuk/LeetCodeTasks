package easy.twosum;

import java.util.HashMap;
import java.util.Map;

import basic.UtilClass;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] expectedOutput = { 0, 1 };
		int[] actualOutput = twoSum(nums, target);
		UtilClass.printArray(actualOutput);
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> twoSumMap = new HashMap<Integer, Integer>();
		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			twoSumMap.put(nums[i], target - nums[i]);
		}
		return output;
	}

}
