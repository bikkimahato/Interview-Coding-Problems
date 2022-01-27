// Buy And Sell Stocks - Two Transactions Allowed
// You are required to print the maximum profit you can make if you are allowed two transactions at-most.
package dp;

public class BuyAndSellStocksTwoTransactionsAllowed {

	public static void main(String[] args) {
		int n = 9;
		int prices[] = { 11, 6, 7, 19, 4, 1, 6, 18, 4 };
		System.out.println(calculateMaxProfit(n, prices));

	}

	private static int calculateMaxProfit(int n, int[] prices) {
		int leastsf = prices[0];
		int mprofit = 0;
		int dpl[] = new int[n];
		for (int i = 1; i < n; i++) {
			if (prices[i] < leastsf) {
				leastsf = prices[i];
			}
			mprofit = prices[i] - leastsf;
			if (dpl[i - 1] < mprofit) {
				dpl[i] = mprofit;
			} else {
				dpl[i] = dpl[i - 1];
			}
		}

		int maxsf = prices[n - 1];
		int maxbsp = 0;
		int dpr[] = new int[n];
		for (int i = n - 2; i >= 0; i--) {
			if (prices[i] > maxsf) {
				maxsf = prices[i];
			}
			maxbsp = maxsf - prices[i];
			if (maxbsp > dpr[i + 1]) {
				dpr[i] = maxbsp;
			} else {
				dpr[i] = dpr[i + 1];
			}
		}
		int op = 0;
		for (int i = 0; i < prices.length; i++) {
			if (dpl[i] + dpr[i] > op) {
				op = dpl[i] + dpr[i];
			}
		}
		return op;
	}
}
