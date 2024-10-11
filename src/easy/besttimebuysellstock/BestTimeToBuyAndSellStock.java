package easy.besttimebuysellstock;

public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int output = buySellStock(prices);
		System.out.println("Max profit for prices {7, 1, 5, 3, 6, 4}: " + output);

		int[] prices1 = { 1, 2, 3, 4, 5 };
		int output1 = buySellStock(prices1);
		System.out.println("Max profit for prices {1, 2, 3, 4, 5}: " + output1);

		int[] prices2 = { 7, 6, 4, 3, 1 };
		int output2 = buySellStock(prices2);
		System.out.println("Max profit for prices {7, 6, 4, 3, 1}: " + output2);
	}

	private static int buySellStock(int[] prices) {
		if (prices == null || prices.length < 2) {
			return 0;
		}
		int maxProfit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				maxProfit += prices[i + 1] - prices[i];
			}
		}
		return maxProfit;
	}
}