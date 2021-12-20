// Climbing Stairs Tabulation With Variable Jumps
// You are given n numbers, where ith element's value represents - till how far from the step you could jump to in a single move. 
package dp;

public class ClimbingStairsTabulationWithVariableJumps {

	public static void main(String[] args) {
		int n = 6;
		int arr[] = { 3, 3, 0, 2, 2, 3 };
		System.out.println(countPaths(n, arr));
	}

	public static int countPaths(int n, int arr[]) {
		int dp[] = new int[n + 1];
		dp[n] = 1;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
				dp[i] += dp[i + j];
			}
		}
		return dp[0];
	}

}
