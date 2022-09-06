package linked_list;

import java.util.*;

public class DetectLoop {

	static Node head; // head of list

	/* Linked list Node */
	static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	static public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	// Returns true if there is a loop in linked
	// list else returns false.
	public static boolean detectLoop(Node head) {
		HashSet<Node> hs = new HashSet<>();
		while (head != null) {
			if (hs.contains(head)) {
				return true;
			}
			hs.add(head);
			head = head.next;
		}
		return false;
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		DetectLoop llist = new DetectLoop();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/* Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		if (detectLoop(head))
			System.out.println("Loop found");
		else
			System.out.println("No Loop");
	}
}
