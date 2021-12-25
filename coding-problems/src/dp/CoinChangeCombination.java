//Coin Change Combination
package dp;

public class CoinChangeCombination {

	public static void main(String[] args) {
		int n = 4;
		int arr[] = { 2, 3, 5, 6 };
		int sum = 10;
		System.out.println(solveCoin(n, arr, sum));
	}

	public static int solveCoin(int n, int arr[], int sum) {
		int dp[] = new int[sum + 1];
		dp[0] = 1;
		for (int i = 0; i < n; i++) {
			for (int j = arr[i]; j <= sum; j++) {
				dp[j] += dp[j - arr[i]];
			}
		}
		return dp[sum];
	}
}
