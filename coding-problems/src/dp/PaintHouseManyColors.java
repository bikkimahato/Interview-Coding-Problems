//Paint House (Many Colors)
//You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.
package dp;

public class PaintHouseManyColors {

	public static void main(String[] args) {
		int n = 4; // houses
		int k = 3; // colors
		int arr[][] = { { 1, 5, 7 }, { 5, 8, 4 }, { 3, 2, 9 }, { 1, 2, 4 } };
		System.out.println(calcMinCost(n, k, arr));
	}

	private static long calcMinCost(int n, int k, int[][] arr) {
		int dp[][] = new int[n][k];
		int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;

		for (int j = 0; j < k; j++) {
			dp[0][j] = arr[0][j];
			if (arr[0][j] <= min) {
				secondMin = min;
				min = arr[0][j];
			} else if (arr[0][j] <= secondMin) {
				secondMin = arr[0][j];
			}
		}

		for (int i = 1; i < n; i++) {
			int Nmin = Integer.MAX_VALUE, NsecondMin = Integer.MAX_VALUE;
			for (int j = 0; j < k; j++) {
				if (min == dp[i - 1][j]) {
					dp[i][j] = arr[i][j] + secondMin;
				} else {
					dp[i][j] = arr[i][j] + min;
				}

				if (dp[i][j] <= Nmin) {
					NsecondMin = Nmin;
					Nmin = dp[i][j];
				} else if (dp[i][j] <= NsecondMin) {
					NsecondMin = dp[i][j];
				}
			}
			min = Nmin;
			secondMin = NsecondMin;
		}
		return min;
	}

}
