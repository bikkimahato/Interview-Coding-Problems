//Get Common Element
package heap;

import java.util.HashMap;

public class GetCommonElement2 {

	public static void main(String[] args) {
		int a1[] = { 1, 1, 2, 3, 3, 4, 5 };
		int a2[] = { 1, 1, 1, 2, 2, 5, 5, 5 };
		findCommon(a1, a2);

	}

	private static void findCommon(int[] a1, int[] a2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : a1) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		for (int i : a2) {
			if (hm.containsKey(i) && hm.get(i) > 0) {
				System.out.print(i + " ");
				hm.put(i, hm.get(i) - 1);
			}
		}

	}

}
