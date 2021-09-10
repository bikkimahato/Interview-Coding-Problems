package recursion;

public class Print1toN {

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
		solve(n - 1);
		// Induction
		System.out.println(n);
	}

}
