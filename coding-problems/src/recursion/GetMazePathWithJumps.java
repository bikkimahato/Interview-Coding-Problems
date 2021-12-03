//Get Maze Path With Jumps
//In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).
package recursion;

import java.util.ArrayList;

public class GetMazePathWithJumps {

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

		ArrayList<String> paths = new ArrayList<>();

		// Horizontal moves
		for (int h = 1; h <= dc - sc; h++) {
			ArrayList<String> hpaths = getMazePaths(sr, sc + h, dr, dc);
			for (String p : hpaths) {
				paths.add("h" + h + p);
			}
		}

		// Vertical moves
		for (int v = 1; v <= dr - sr; v++) {
			ArrayList<String> vpaths = getMazePaths(sr + v, sc, dr, dc);
			for (String p : vpaths) {
				paths.add("v" + v + p);
			}
		}

		// Diagonal moves
		for (int d = 1; d <= dr - sr && d <= dc - sc; d++) {
			ArrayList<String> dpaths = getMazePaths(sr + d, sc + d, dr, dc);
			for (String p : dpaths) {
				paths.add("d" + d + p);
			}
		}
		return paths;
	}
}
