package easy.containsduplicates;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicates {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		boolean containsDupl = containsDuplicates(nums);
		System.out.println(containsDupl);

	}

	private static boolean containsDuplicates(int[] nums) {
		Map <Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (numsMap.containsKey(nums[i])) {
				return true;
			} else {
				numsMap.put(nums[i], 1);
			}
		}
		return false;

	}

}
