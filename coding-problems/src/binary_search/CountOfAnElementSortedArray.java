package binary_search;

public class CountOfAnElementSortedArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 5, 6, 7, 8, 9, 10 };
		int k = 2;
		int left = solveLeft(arr, k);
		int right = solveRight(arr, k);
		if (left == -1 || right == -1) {
			System.out.println(0);
		} else {
			System.out.println(right - left + 1);
		}

	}

	private static int solveLeft(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (k == arr[mid]) {
				res = mid;
				end = mid - 1;
			} else if (k < arr[mid]) {
				end = mid - 1;
			} else if (k > arr[mid]) {
				start = mid + 1;
			}
		}
		return res;
	}

	private static int solveRight(int[] arr, int k) {
		int start = 0;
		int end = arr.length - 1;
		int res = -1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (k == arr[mid]) {
				res = mid;
				start = mid + 1;
			} else if (k < arr[mid]) {
				end = mid - 1;
			} else if (k > arr[mid]) {
				start = mid + 1;
			}
		}
		return res;
	}
}
