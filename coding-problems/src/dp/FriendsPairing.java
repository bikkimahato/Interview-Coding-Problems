//Friends Pairing
//You are required to print the number of ways in which these friends can stay single or pair up.
package dp;

public class FriendsPairing {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(findCount(n));

	}

	private static int findCount(int n) {
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + (i - 1) * dp[i - 2];
		}
		return dp[n];
	}

}
