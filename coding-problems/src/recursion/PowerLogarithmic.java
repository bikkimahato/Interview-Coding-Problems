//Power (x,n) in logarithmic time
package recursion;

public class PowerLogarithmic {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println(power(x, n));

	}

	private static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}

		int xn2 = power(x, n / 2);
		int xn = xn2 * xn2;

		if (n % 2 == 1) {
			xn = x * xn;
		}

		return xn;
	}

}
