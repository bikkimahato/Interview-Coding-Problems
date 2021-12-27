//Coin Change Permutations
package dp;

public class CoinChangePermutations {

	public static void main(String[] args) {
		int n = 4;
		int arr[] = { 2, 3, 5, 6 };
		int sum = 10;
		System.out.println(solveCoin(n, arr, sum));
	}

	public static int solveCoin(int n, int arr[], int sum) {
		int dp[] = new int[sum + 1];
		dp[0] = 1;
		for (int i = 1; i <= sum; i++) {
			for (int coin : arr) {
				if (coin <= i) {
					dp[i] += dp[i - coin];
				}
			}
		}
		return dp[sum];
	}

}
