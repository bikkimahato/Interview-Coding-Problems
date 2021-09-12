//Height of a Binary Tree
package recursion;

public class HeightBinaryTree {

	public static void main(String[] args) {
		Node root = new Node(15);
		root.left = new Node(10);
		root.right = new Node(20);
		root.left.left = new Node(8);
		root.left.right = new Node(12);
		root.right.left = new Node(16);
		root.right.right = new Node(25);

		System.out.println(solve(root));

	}

	private static int solve(Node root) {
		// Base Condition
		if (root == null) {
			return 0;
		}
		// Hypothesis
		int left = solve(root.left);
		int right = solve(root.right);
		// Induction
		return 1 + Math.max(left, right);
	}

}

class Node {
	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}
