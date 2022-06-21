//Count Number of Pairs With Absolute Difference K
package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CountPairsAbsoluteDifferenceK {

	public static void main(String[] args) {
		int nums[] = { 3, 2, 1, 5, 4 };
		int k = 2;
		System.out.println(countKDifference(nums, k));
	}

	public static int countKDifference(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		int res = 0;

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i] - k)) {
				res += map.get(nums[i] - k);
			}
			if (map.containsKey(nums[i] + k)) {
				res += map.get(nums[i] + k);
			}
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		return res;
	}
}
