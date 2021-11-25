//Last Index of Occurrence In Array
package recursion;

public class LastIndexOfOccurrenceInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 5, 8, 9, 3 };
		int x = 3;
		System.out.println(lastIndex(arr, 0, x));

	}

	private static int lastIndex(int[] arr, int i, int x) {
		if (arr.length == i) {
			return -1;
		}
		int a = lastIndex(arr, i + 1, x);
		if (a == -1) {
			if (arr[i] == x) {
				return i;
			} else {
				return -1;
			}
		} else {
			return a;
		}
	}

}
