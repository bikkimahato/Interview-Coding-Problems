//Tower of Hanoi
package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 3;
		toh(n, 'A', 'B', 'C'); // A-Source, B-Destination, C-Helper

	}

	private static void toh(int n, char A, char B, char C) {
		if (n == 0) {
			return;
		}
		toh(n - 1, A, C, B);
		System.out.println(n + "[" + A + " -> " + B + "]");
		toh(n - 1, C, B, A);

	}

}
