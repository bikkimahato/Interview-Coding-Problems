//Maximum of an Array
package recursion;

public class MaximumOfAnArray {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7 };
		System.out.println(maxOfArray(arr, 0));

	}

	private static int maxOfArray(int[] arr, int i) {
		if (arr.length - 1 == i) {
			return arr[i];
		}
		int res = maxOfArray(arr, i + 1);
		return arr[i] > res ? arr[i] : res;
	}

}
