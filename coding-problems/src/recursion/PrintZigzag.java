//Print Zigzag
package recursion;

public class PrintZigzag {

	public static void main(String[] args) {
		int n = 3;
		solve(n);
	}

	private static void solve(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		solve(n - 1);
		System.out.print(n + " ");
		solve(n - 1);
		System.out.print(n + " ");

	}

}
