package binary_search;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int k = 2;
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
				end = mid - 1;
			} else if (k > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}

}
