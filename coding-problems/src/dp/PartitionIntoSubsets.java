//Partition Into Subsets
//You are required to print the number of ways in which these elements can be partitioned in k non-empty subsets.
package dp;

public class PartitionIntoSubsets {

	public static void main(String[] args) throws Exception {
		int n = 4;
		int k = 3;

		long res = partitionKSubset(n, k);
		System.out.println(res);
	}

	public static long partitionKSubset(int n, int k) {
		long dp[][] = new long[k + 1][n + 1];
		for (int i = 1; i <= k; i++) {
			for (int j = 1; j <= n; j++) {
				if (j < i) {
					dp[i][j] = 0;
				} else if (j == i) {
					dp[i][j] = 1;
				} else {
					dp[i][j] = i * dp[i][j - 1] + dp[i - 1][j - 1];
				}
			}
		}
		return dp[k][n];
	}

}
