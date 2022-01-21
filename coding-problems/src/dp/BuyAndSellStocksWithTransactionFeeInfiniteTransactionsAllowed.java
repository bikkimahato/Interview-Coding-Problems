//Buy And Sell Stocks With Transaction Fee - Infinite Transactions Allowed
//You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
package dp;

public class BuyAndSellStocksWithTransactionFeeInfiniteTransactionsAllowed {

	public static void main(String[] args) {
		int n = 9;
		int prices[] = { 11, 6, 7, 19, 4, 1, 6, 18, 4 };
		int fee = 3;
		System.out.println(calculateMaxProfit(n, prices, fee));
	}

	private static int calculateMaxProfit(int n, int[] arr, int fee) {
		int bsp = -arr[0], ssp = 0;
		for (int i = 1; i < n; i++) {
			int nbsp = 0, nssp = 0;
			if (ssp - arr[i] > bsp) {
				nbsp = ssp - arr[i];
			} else {
				nbsp = bsp;
			}
			if (bsp + arr[i] - fee > ssp) {
				nssp = bsp + arr[i] - fee;
			} else {
				nssp = ssp;
			}

			bsp = nbsp;
			ssp = nssp;
		}
		return ssp;
	}

}
