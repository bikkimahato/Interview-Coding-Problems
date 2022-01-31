//Get Common Element
package heap;

import java.util.HashMap;

public class GetCommonElement {

	public static void main(String[] args) {
		int a1[] = { 1, 4, 7, 3, 6, 7, 2, 3, 5 };
		int a2[] = { 4, 3, 6, 3, 1, 2, 0, 4, 5 };
		findCommon(a1, a2);

	}

	private static void findCommon(int[] a1, int[] a2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : a1) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		for (int i : a2) {
			if (hm.containsKey(i)) {
				System.out.print(i + " ");
				hm.remove(i);
			}
		}

	}

}
