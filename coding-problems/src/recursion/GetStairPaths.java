//Get Stair Paths
//You are allowed to climb 1 step, 2 steps or 3 steps in one move.
package recursion;

import java.util.ArrayList;

public class GetStairPaths {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(getStairPaths(n));
	}

	public static ArrayList<String> getStairPaths(int n) {
		if (n == 0) {
			ArrayList<String> al = new ArrayList<>();
			al.add("");
			return al;
		} else if (n < 0) {
			return new ArrayList<>();
		}

		ArrayList<String> p1 = getStairPaths(n - 1);
		ArrayList<String> p2 = getStairPaths(n - 3);
		ArrayList<String> p3 = getStairPaths(n - 2);

		ArrayList<String> paths = new ArrayList<>();

		for (String p : p1) {
			paths.add(1 + p);
		}
		for (String p : p2) {
			paths.add(2 + p);
		}
		for (String p : p3) {
			paths.add(3 + p);
		}
		return paths;
	}
}
