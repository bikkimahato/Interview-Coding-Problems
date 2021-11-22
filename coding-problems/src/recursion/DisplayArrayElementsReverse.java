//Display Array Elements in Reverse
package recursion;

public class DisplayArrayElementsReverse {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7 };
		displayArrReverse(arr, 0);

	}

	private static void displayArrReverse(int[] arr, int i) {
		if (arr.length == i) {
			return;
		}
		displayArrReverse(arr, i + 1);
		System.out.println(arr[i]);
	}

}
