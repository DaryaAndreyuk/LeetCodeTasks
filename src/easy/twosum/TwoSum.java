package easy.twosum;

import java.util.HashMap;
import java.util.Map;

import basic.UtilClass;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 3,3 };
		int target = 6;
		// int[] expectedOutput = { 0, 1 };
		int[] actualOutput = twoSum(nums, target);
		UtilClass.printArray(actualOutput);
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexMap.containsKey(complement)) {
                return new int[] {indexMap.get(complement), i};
            }
            indexMap.put(nums[i], i);
        }
        
        // Return an empty array or handle it according to your requirement if no solution exists
        return new int[0];
		
	}

}
