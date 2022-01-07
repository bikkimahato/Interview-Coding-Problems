//Paint Fence
//You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive fences have same colors.
package dp;

public class PaintFence {

	public static void main(String[] args) {
		int n = 5; // fences
		int k = 3; // colors
		System.out.println(calcNoFences(n, k));
	}

	private static long calcNoFences(int n, int k) {
		long ii = k * 1;
		long ij = k * (k - 1);
		long total = ii + ij;

		for (int i = 3; i <= n; i++) {
			ii = ij * 1;
			ij = total * (k - 1);

			total = ii + ij;
		}
		return total;
	}

}
