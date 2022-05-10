package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 1, 9, 10 };
		int k = 3;
		solveKthSmallest(arr, k);
	}

	private static void solveKthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i : arr) {
			maxHeap.add(i);
			if (maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		System.out.println(maxHeap.peek());
	}
}
