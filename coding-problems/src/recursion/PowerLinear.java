//Power (x,n)
package recursion;

public class PowerLinear {

	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		System.out.println(power(x, n));

	}

	private static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}

}
