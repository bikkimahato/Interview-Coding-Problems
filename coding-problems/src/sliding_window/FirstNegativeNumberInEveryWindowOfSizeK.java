//First Negative Number in every Window of Size K
package sliding_window;

import java.util.ArrayList;

public class FirstNegativeNumberInEveryWindowOfSizeK {

	public static void main(String[] args) {
		int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;
		solve(arr, k);
	}

	private static void solve(int[] arr, int k) {
		int n = arr.length;
		int i = 0, j = 0;
		ArrayList<Integer> al = new ArrayList<>();
		int result[] = new int[n - k + 1];
		while (j < n) {
			if (arr[j] < 0) {
				al.add(arr[j]);
			}
			if (j - i + 1 == k) {
				if (al.size() == 0) {
					result[i] = 0;
				} else if (al.get(0) == arr[i]) {
					result[i] = al.remove(0);
				} else {
					result[i] = al.get(0);
				}
				i++;
			}
			j++;
		}
		for (int x : result) {
			System.out.print(x + " ");
		}
	}
}
