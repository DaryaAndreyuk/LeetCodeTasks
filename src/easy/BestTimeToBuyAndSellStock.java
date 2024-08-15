package easy;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] input = { 12, 20, 4, 8, 10 };
		int[] input1 = { 4, 8, 10 };
		int result = maxProfit(input);
		System.out.println(result);
	}

	public static int maxProfit(int[] nums) {
		int maxProfit = 0;
		int minValue = nums[0];
		for (int i = 1; i < nums.length; i++) {
			int profit = nums[i] - minValue;
			if (maxProfit < profit)
				maxProfit = profit;
			if (nums[i] < minValue)
				minValue = nums[i];
		}
		return maxProfit;
	}
}