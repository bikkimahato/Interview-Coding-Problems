//Display Array Elements
package recursion;

public class DisplayArrayElements {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7 };
		displayArr(arr, 0);
	}

	private static void displayArr(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		displayArr(arr, idx + 1);

	}

}
