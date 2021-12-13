//Target Sum Subsets
package recursion;

public class TargetSumSubsets {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int tar = 60;
		printTargetSumSubsets(arr, 0, "", 0, tar);
	}

	// set is the subset
	// sos is sum of subset
	// tar is target
	public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {
		if (idx == arr.length) {
			if (sos == tar) {
				System.out.println(set + ".");
			}
			return;
		}

		printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
		printTargetSumSubsets(arr, idx + 1, set, sos, tar);
	}
}
