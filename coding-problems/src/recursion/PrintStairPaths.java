//Print Stair Paths
//You are allowed to climb 1 step, 2 steps or 3 steps in one move.
package recursion;

public class PrintStairPaths {

	public static void main(String[] args) {
		int n = 4;
		printStairPaths(n, "");
	}

	public static void printStairPaths(int n, String path) {
		if (n == 0) {
			System.out.println(path);
			return;
		}
		if (n < 0) {
			return;
		}

		printStairPaths(n - 1, path + "1");
		printStairPaths(n - 2, path + "2");
		printStairPaths(n - 3, path + "3");
	}
}
