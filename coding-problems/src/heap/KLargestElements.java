//K Largest Elements
package heap;

import java.util.PriorityQueue;

public class KLargestElements {

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 1, 9, 10 };
		int k = 3;
		solveKLargest(arr, k);
	}

	private static void solveKLargest(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i : arr) {
			minHeap.add(i);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}

		while (minHeap.size() > 0) {
			System.out.println(minHeap.poll());
		}

	}
}
