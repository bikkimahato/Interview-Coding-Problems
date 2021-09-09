//Maximum of all subarrays of size k
package sliding_window;

import java.util.PriorityQueue;

public class MaximumOfAllSubarraysOfSizeK {

	public static void main(String[] args) {
		int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;
		int res[] = solve(arr, k);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	private static int[] solve(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((i1, i2) -> arr[i2] - arr[i1]);
		int n = arr.length;
		int[] output = new int[n - k + 1];
		int outputIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			while (!pq.isEmpty() && pq.peek() < i - k + 1) {
				pq.remove();
			}
			pq.add(i);
			if (i - k + 1 >= 0) {
				output[outputIndex++] = arr[pq.peek()];
			}
		}

		return output;
	}

}
