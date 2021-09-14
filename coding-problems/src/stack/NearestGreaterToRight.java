//NGR | Nearest Greater to right | Next Largest Element
package stack;

import java.util.Stack;

public class NearestGreaterToRight {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 4 };
		int res[] = solve(arr);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

	private static int[] solve(int[] arr) {
		Stack<Integer> s = new Stack<>();
		int r[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (s.isEmpty()) {
				r[i] = -1;
			} else if (!s.isEmpty() && s.peek() > arr[i]) {
				r[i] = s.peek();
			} else if (!s.isEmpty() && s.peek() <= arr[i]) {
				while (!s.isEmpty() && s.peek() <= arr[i]) {
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
