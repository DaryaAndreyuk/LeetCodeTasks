package easy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ContainsDuplicate {

	public static void main(String[] args) {
		/*
		 * Given an integer array nums, return true if any value appears at least twice
		 * in the array, and return false if every element is distinct.
		 * 
		 * 
		 * Example 1:
		 * 
		 * Input: nums = [1,2,3,1] Output: true Example 2:
		 * 
		 * Input: nums = [1,2,3,4] Output: false Example 3:
		 * 
		 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
		 */

		/*
		 * int[] nums = { 1 }; Map<Integer, Integer> numsMap = new HashMap<>(); for (int
		 * num : nums) { if (!numsMap.containsKey(num)) { numsMap.put(num, 1); } else {
		 * int freqValue = numsMap.get(num); numsMap.replace(num, freqValue, freqValue +
		 * 1); System.out.println("true"); break; } } if (numsMap.size() == nums.length)
		 * System.out.println("false");
		 */

		int[] nums = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		Set<Integer> numsSet = new HashSet<Integer>();
		for (int num : nums) {
			numsSet.add(num);
		}
		if (nums.length == numsSet.size())
			System.out.println("false");
		else
			System.out.println("true");
		
		//Number 1
		/*class Solution {
		    public boolean containsDuplicate(int[] nums) {
				Set<Integer> numsSet = new HashSet<Integer>();
				for (int num : nums) {
					numsSet.add(num);
				}
				if (nums.length == numsSet.size())
					return false;
				else
					return true;
		    }
		}*/
		
		//Number 2
		/*class Solution {
    	public boolean containsDuplicate(int[] nums) {
	        //int[] nums = { 1 };
			Map<Integer, Integer> numsMap = new HashMap<>();
			for (int num : nums) {
				if (!numsMap.containsKey(num)) {
					numsMap.put(num, 1);
				} else {
					int freqValue = numsMap.get(num);
					numsMap.replace(num, freqValue, freqValue + 1);
					return true;
				}
			}
			if (numsMap.size() == nums.length)
				return false;
	        else return true;
	    }
	}*/

	}

}
