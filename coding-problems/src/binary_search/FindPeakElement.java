package binary_search;

public class FindPeakElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 1, 3, 5, 6, 4 };
		System.out.println(solve(arr));
	}

	private static int solve(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end && arr.length > 1) {
			int mid = start + (end - start) / 2;

			if (mid > 0 && mid < arr.length - 1) {
				if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
					return mid;
				} else if (arr[mid - 1] > arr[mid]) {
					end = mid - 1;
				} else if (arr[mid + 1] > arr[mid]) {
					start = mid + 1;
				}
			} else if (mid == 0) {
				if (arr[mid] > arr[mid + 1]) {
					return mid;
				} else {
					return 1;
				}
			} else if (mid == arr.length - 1) {
				if (arr[mid] > arr[mid - 1]) {
					return mid;
				} else {
					return arr.length - 2;
				}
			}
		}
		return start;
	}
}
