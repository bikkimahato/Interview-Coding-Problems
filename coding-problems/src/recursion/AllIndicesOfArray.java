//All Indices Of Array
package recursion;

public class AllIndicesOfArray {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 7, 5, 3, 8, 9, 3 };
		int x = 3;
		int[] iarr = allIndices(arr, x, 0, 0);

		if (iarr.length == 0) {
			System.out.println();
			return;
		}

		for (int i = 0; i < iarr.length; i++) {
			System.out.println(iarr[i]);
		}
	}

	public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
		if (arr.length == idx) {
			return new int[fsf];
		}

		if (arr[idx] == x) {
			int iarr[] = allIndices(arr, x, idx + 1, fsf + 1);
			iarr[fsf] = idx;
			return iarr;
		} else {
			int iarr[] = allIndices(arr, x, idx + 1, fsf);
			return iarr;
		}
	}
}
