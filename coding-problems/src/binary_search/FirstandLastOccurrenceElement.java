//First and Last occurrence of an Element
package binary_search;

public class FirstandLastOccurrenceElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 5, 6, 7, 8, 9, 10 };
		int k = 2;
		int first = solveLeft(arr, k);
		int right = solveRight(arr, k);
		if (first == -1 || right == -1) {
			System.out.println(first);
		} else {
			System.out.println("First : " + first + " Last : " + right);
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
