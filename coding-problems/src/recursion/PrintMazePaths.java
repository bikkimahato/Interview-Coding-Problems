//Print Maze Paths
//Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).
package recursion;

public class PrintMazePaths {

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
		if (sc < dc) {
			printMazePaths(sr, sc + 1, dr, dc, psf + "h");
		}
		if (sr < dr) {
			printMazePaths(sr + 1, sc, dr, dc, psf + "v");
		}
	}
}
