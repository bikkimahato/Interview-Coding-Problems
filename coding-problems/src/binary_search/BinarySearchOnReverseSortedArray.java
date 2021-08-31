//Binary Search on Reverse Sorted Array
package binary_search;

public class BinarySearchOnReverseSortedArray {

	public static void main(String[] args) {
		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int k = 10;
		System.out.println(solve(arr, k));

	}

	private static int solve(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (k == arr[mid]) {
				return mid;
			} else if (k < arr[mid]) {
				start = mid + 1;
			} else if (k > arr[mid]) {
				end = mid - 1;
			}
		}
		return -1;
	}
}
