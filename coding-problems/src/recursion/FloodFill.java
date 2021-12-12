//Flood Fill
package recursion;

public class FloodFill {

	public static void main(String[] args) {
		int n = 3, m = 3;
		int[][] arr = { { 0, 0, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		boolean[][] visited = new boolean[n][m];
		floodfill(arr, 0, 0, "", visited);

	}

	public static void floodfill(int[][] maze, int sr, int sc, String asf, boolean[][] visited) {
		if (sr < 0 || sc < 0 || sr == maze.length || sc == maze[0].length || maze[sr][sc] == 1 || visited[sr][sc]) {
			return;
		}

		if (sr == maze.length - 1 && sc == maze[0].length - 1) {
			System.out.println(asf);
			return;
		}
		visited[sr][sc] = true;
		floodfill(maze, sr - 1, sc, asf + "t", visited);
		floodfill(maze, sr, sc - 1, asf + "l", visited);
		floodfill(maze, sr + 1, sc, asf + "d", visited);
		floodfill(maze, sr, sc + 1, asf + "r", visited);
		visited[sr][sc] = false;
	}
}
