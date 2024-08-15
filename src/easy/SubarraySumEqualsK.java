package easy;

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        // HashMap to store the frequency of cumulative sums
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1); // Base case: for subarrays that sum exactly to k from the start

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            // Update the current cumulative sum
            currentSum += num;

            // Check if there exists a previous sum such that the difference is k
            if (sumMap.containsKey(currentSum - k)) {
                // If yes, add the frequency of that sum to the count
                count += sumMap.get(currentSum - k);
            }

            // Update the frequency of the current cumulative sum in the map
            sumMap.put(currentSum, sumMap.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        SubarraySumEqualsK solution = new SubarraySumEqualsK();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(solution.subarraySum(nums1, k1)); // Output: 2

        int[] nums2 = {1, 2, 3};
        int k2 = 3;
        System.out.println(solution.subarraySum(nums2, k2)); // Output: 2
    }
}