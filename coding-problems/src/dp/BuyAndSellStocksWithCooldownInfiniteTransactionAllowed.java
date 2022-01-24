//Buy And Sell Stocks With Cooldown - Infinite Transaction Allowed
//You are required to print the maximum profit you can make if you are allowed infinite transactions, but have to cooldown for 1 day after 1 transaction
//i.e. you cannot buy on the next day after you sell, you have to cooldown for a day at-least before buying again.
package dp;

public class BuyAndSellStocksWithCooldownInfiniteTransactionAllowed {
	public static void main(String[] args) {
		int n = 9;
		int prices[] = { 11, 6, 7, 19, 4, 1, 6, 18, 4 };
		System.out.println(calculateMaxProfit(n, prices));
	}

	private static int calculateMaxProfit(int n, int[] arr) {
		int bsp = -arr[0], ssp = 0, csp = 0;
		for (int i = 1; i < n; i++) {
			int nbsp = 0, nssp = 0, ncsp = 0;

			if (csp - arr[i] > bsp) {
				nbsp = csp - arr[i];
			} else {
				nbsp = bsp;
			}

			if (bsp + arr[i] > ssp) {
				nssp = bsp + arr[i];
			} else {
				nssp = ssp;
			}

			if (ssp > csp) {
				ncsp = ssp;
			} else {
				ncsp = csp;
			}

			bsp = nbsp;
			ssp = nssp;
			csp = ncsp;
		}
		return ssp;
	}
}
