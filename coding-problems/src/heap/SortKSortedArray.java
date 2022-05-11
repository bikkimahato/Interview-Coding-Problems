//Sort K-sorted Array
package heap;

import java.util.PriorityQueue;

public class SortKSortedArray {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 5, 6, 7, 8, 9 };
		int k = 3;
		sortKSortedV1(arr, k);
	}

	private static void sortKSorted(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i <= k; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = k + 1; i < arr.length; i++) {
			System.out.println(minHeap.poll());
			minHeap.add(arr[i]);
		}
		while (minHeap.size() > 0) {
			System.out.println(minHeap.poll());
		}

	}

	private static void sortKSortedV1(int[] arr, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i : arr) {
			minHeap.add(i);
			if (minHeap.size() > k) {
				System.out.println(minHeap.poll());
			}
		}
		while (minHeap.size() > 0) {
			System.out.println(minHeap.poll());
		}

	}
}
