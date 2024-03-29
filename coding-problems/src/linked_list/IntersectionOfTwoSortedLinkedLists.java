package linked_list;

import java.util.HashSet;

public class IntersectionOfTwoSortedLinkedLists {
	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;

		}

	}

	public void printList() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}

	public void append(int d) {

		Node n = new Node(d);

		if (head == null) {
			head = new Node(d);
			return;
		}

		n.next = null;
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		last.next = n;
		return;

	}

	static int[] intersection(Node tmp1, Node tmp2, int k) {
		int[] res = new int[k];

		HashSet<Integer> set = new HashSet<Integer>();
		while (tmp1 != null) {

			set.add(tmp1.data);
			tmp1 = tmp1.next;

		}

		int cnt = 0;

		while (tmp2 != null) {
			if (set.contains(tmp2.data)) {
				res[cnt] = tmp2.data;
				cnt++;
			}
			tmp2 = tmp2.next;

		}

		return res;

	}

	public static void main(String[] args) {
		IntersectionOfTwoSortedLinkedLists ll = new IntersectionOfTwoSortedLinkedLists();
		IntersectionOfTwoSortedLinkedLists ll1 = new IntersectionOfTwoSortedLinkedLists();

		ll.append(0);
		ll.append(1);
		ll.append(2);
		ll.append(3);
		ll.append(4);
		ll.append(5);
		ll.append(6);
		ll.append(7);

		ll1.append(9);
		ll1.append(0);
		ll1.append(12);
		ll1.append(3);
		ll1.append(4);
		ll1.append(5);
		ll1.append(6);
		ll1.append(7);

		int[] arr = intersection(ll.head, ll1.head, 6);

		for (int i : arr) {
			System.out.println(i);
		}

	}

}