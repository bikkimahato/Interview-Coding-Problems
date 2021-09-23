//NSL | Nearest Smaller to left
package stack;

import java.util.Stack;

public class NearestSmallerToLeft {

	public static void main(String[] args) {
		int arr[] = { 4, 5, 2, 10, 8 };
		int res[] = solve(arr);
		for (int i : res) {
			System.out.print(i + " ");
		}

	}

	private static int[] solve(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int r[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (s.isEmpty()) {
				r[i] = -1;
			} else if (!s.isEmpty() && s.peek() < arr[i]) {
				r[i] = s.peek();
			} else if (!s.isEmpty() && s.peek() >= arr[i]) {
				while (!s.isEmpty() && s.peek() >= arr[i]) {
					s.pop();
				}
				if (s.isEmpty()) {
					r[i] = -1;
				} else {
					r[i] = s.peek();
				}
			}
			s.push(arr[i]);
		}
		return r;
	}

}
