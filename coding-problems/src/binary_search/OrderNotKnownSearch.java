//Order Not Known Search
package binary_search;

public class OrderNotKnownSearch {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int arr[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int k = 2;
		System.out.println(solve(arr, k));
	}

	private static int solve(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAscending = false;
		if (arr[start] < arr[end]) {
			isAscending = true;
		}
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (k == arr[mid]) {
				return mid;
			} else if (isAscending && k < arr[mid]) {
				end = mid - 1;
			} else if (!isAscending && k < arr[mid]) {
				start = mid + 1;
			} else if (isAscending && k > arr[mid]) {
				start = mid + 1;
			} else if (!isAscending && k > arr[mid]) {
				end = mid - 1;
			}
		}
		return -1;
	}
}
