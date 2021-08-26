//Maximum Sum Subarray of size K
package sliding_window;

public class MaximumSumSubarrayOfSizeK {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 8, 2, 9, 1 };
		int k = 3;
		System.out.println(solve(arr, k));
	}

	private static int solve(int[] arr, int k) {
		int n = arr.length;
		int i = 0, j = 0, max = Integer.MIN_VALUE, sum = 0;
		while (j < n) {
			sum += arr[j];
			if (j - i + 1 == k) {
				max = Math.max(max, sum);
				sum -= arr[i];
				i++;
			}
			j++;
		}
		return max;
	}

}
