package hashmap;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

	}

	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : nums) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		int max = Integer.MIN_VALUE;
		int res = 0;
		for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
			if (m.getValue() > max) {
				max = m.getValue();
				res = m.getKey();
			}
		}
		return res;
	}
}
