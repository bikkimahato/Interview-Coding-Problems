//Get Maze Paths
//Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
package recursion;

import java.util.ArrayList;

public class GetMazePaths {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		System.out.println(getMazePaths(1, 1, n, m));

	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> r = new ArrayList<>();
			r.add("");
			return r;
		}

		ArrayList<String> hpaths = new ArrayList<>();
		ArrayList<String> vpaths = new ArrayList<>();

		if (sc < dc) {
			hpaths = getMazePaths(sr, sc + 1, dr, dc);
		}

		if (sr < dr) {
			vpaths = getMazePaths(sr + 1, sc, dr, dc);
		}

		ArrayList<String> paths = new ArrayList<>();

		for (String s : hpaths) {
			paths.add("h" + s);
		}
		for (String s : vpaths) {
			paths.add("v" + s);
		}

		return paths;
	}
}
