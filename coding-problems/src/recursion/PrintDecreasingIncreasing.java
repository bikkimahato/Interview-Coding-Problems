//Print Decreasing Increasing
package recursion;

public class PrintDecreasingIncreasing {

	public static void main(String[] args) {
		int n = 4;
		solve(n);
	}

	private static void solve(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		solve(n - 1);
		System.out.println(n);
	}

}
