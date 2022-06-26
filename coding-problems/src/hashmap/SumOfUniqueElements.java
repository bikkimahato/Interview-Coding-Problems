package hashmap;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 2 };
		System.out.println(sumOfUnique(nums));
	}

	public static int sumOfUnique(int[] nums) {
		int res = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
			if (map.get(nums[i]) == 1)
				res += nums[i];
			else if (map.get(nums[i]) == 2)
				res -= nums[i];
		}
		return res;
	}
}
