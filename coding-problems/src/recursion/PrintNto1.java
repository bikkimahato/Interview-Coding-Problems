//Print n to 1
package recursion;

public class PrintNto1 {

	public static void main(String[] args) {
		int n = 7;
		solve(n);
	}

	private static void solve(int n) {
		// Base Condition
		if (n == 1) {
			System.out.println(1);
			return;
		}
		// Hypothesis
		System.out.println(n);
		// Induction
		solve(n - 1);
	}

}
