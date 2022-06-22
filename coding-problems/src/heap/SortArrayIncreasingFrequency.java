package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortArrayIncreasingFrequency {

	public static void main(String[] args) {
		int arr[] = { -1, 1, -6, 4, 5, -6, 1, 4, 1 };
		int res[] = frequencySort(arr);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	public static int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int m = 0;
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		PriorityQueue<Integer> pq = new PriorityQueue<>(nums.length,
				(a, b) -> map.get(a).equals(map.get(b)) ? b - a : map.get(a) - map.get(b));
		for (int i : map.keySet()) {
			pq.add(i);
		}
		while (pq.size() > 0) {
			int num = pq.poll();
			int freq = map.get(num);
			for (int i = 0; i < freq; i++) {
				result[m++] = num;
			}
		}
		return result;
	}

}
