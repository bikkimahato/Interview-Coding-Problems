//Merge K Sorted Lists
package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MergeKSortedLists {

	public static void main(String[] args) {
//		int k = 4;
		Integer array[][] = { { 10, 20, 30, 40, 50 }, { 5, 7, 9, 11, 19, 55, 57 }, { 1, 2, 3 }, { 32, 39 } };
		List<List<Integer>> lists = Arrays.stream(array).map(Arrays::asList).collect(Collectors.toList());
		List<Integer> mlist = mergeKSortedLists(lists);
		for (int val : mlist) {
			System.out.print(val + " ");
		}

	}

	public static List<Integer> mergeKSortedLists(List<List<Integer>> lists) {
		List<Integer> rv = new ArrayList<>();

		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i < lists.size(); i++) {
			pq.add(new Pair(i, 0, lists.get(i).get(0)));
		}

		while (pq.size() > 0) {
			Pair p = pq.poll();
			rv.add(p.val);
			p.di++;

			if (p.di < lists.get(p.li).size()) {
				p.val = lists.get(p.li).get(p.di);
				pq.add(p);
			}
		}

		return rv;
	}

	public static class Pair implements Comparable<Pair> {
		int li;
		int di;
		int val;

		Pair(int li, int di, int val) {
			this.li = li;
			this.di = di;
			this.val = val;
		}

		public int compareTo(Pair o) {
			return this.val - o.val;
		}
	}

}
