//Longest Consecutive Sequence
package heap;

import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 7, 6, 7, 3, 5, 12, 15, 11, 9 };
		findLongest(arr);

	}

	private static void findLongest(int[] arr) {
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for (int i : arr) {
			hm.put(i, true);
		}
		for (int i : arr) {
			if (hm.containsKey(i - 1)) {
				hm.put(i, false);
			}
		}

		int maxStart = 0, maxLength = 0;
		for (int i : arr) {
			if (hm.get(i) == true) {
				int length = 1;
				int t = i;
				while (hm.containsKey(t + length)) {
					length++;
				}
				if (length > maxLength) {
					maxStart = t;
					maxLength = length;
				}
			}
		}

		for (int i = 0; i < maxLength; i++) {
			System.out.print(maxStart + i + " ");
		}

	}

}
