package linked_list;

import java.util.Stack;

class Palindrome {
	/* Link list node */
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String args[]) {
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(3);
		Node six = new Node(2);
		Node seven = new Node(1);
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = five;
		five.next = six;
		six.next = seven;
		boolean condition = isPalindrome(one);
		System.out.println("isPalidrome :" + condition);
	}

	static boolean isPalindrome(Node head) {

		Stack<Integer> st = new Stack<>();
		Node temp = head;
		while (temp != null) {
			st.push(temp.data);
			temp = temp.next;
		}

		temp = head;
		while (temp != null) {
			if (st.pop() != temp.data) {
				return false;
			}
			temp = temp.next;
		}
		return true;
	}
}