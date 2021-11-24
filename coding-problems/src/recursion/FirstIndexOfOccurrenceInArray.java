//First Index of Occurrence in Array
package recursion;

public class FirstIndexOfOccurrenceInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 5, 8, 9, 3 };
		int x = 3;
		System.out.println(firstIndex(arr, 0, x));

	}

	private static int firstIndex(int[] arr, int i, int x) {
		if (arr.length == i) {
			return -1;
		}
		if (arr[i] == x) {
			return i;
		} else {
			int fi = firstIndex(arr, i + 1, x);
			return fi;
		}
	}

}
