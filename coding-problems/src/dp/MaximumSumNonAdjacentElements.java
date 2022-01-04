//Maximum Sum Non Adjacent Elements
//You are required to find the maximum sum of a subsequence with no adjacent elements.
package dp;

public class MaximumSumNonAdjacentElements {

	public static void main(String[] args) {
		int arr[] = { 5, 10, 10, 100, 5, 6 };
		System.out.println(solveAdjacent(arr));

	}

	public static int solveAdjacent(int arr[]) {
		int inc = arr[0], exc = 0;
		for (int i = 1; i < arr.length; i++) {
			int nInc = exc + arr[i];
			int nExc = Math.max(inc, exc);

			inc = nInc;
			exc = nExc;
		}

		return Math.max(inc, exc);
	}

}
