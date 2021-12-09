//Print Maze Paths with Jumps
//In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
package recursion;

public class PrintMazePathsWithJumps {

	public static void main(String[] args) {
		int n = 3;
		int m = 3;
		printMazePaths(1, 1, n, m, "");

	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
		if (sr == dr && sc == dc) {
			System.out.println(psf);
			return;
		}

		for (int i = 1; i <= dc - sc; i++) {
			printMazePaths(sr, sc + i, dr, dc, psf + "h" + i);
		}
		for (int i = 1; i <= dr - sr; i++) {
			printMazePaths(sr + i, sc, dr, dc, psf + "v" + i);
		}
		for (int i = 1; i <= dr - sr && i <= dc - sc; i++) {
			printMazePaths(sr + i, sc + i, dr, dc, psf + "d" + i);
		}
	}
}
