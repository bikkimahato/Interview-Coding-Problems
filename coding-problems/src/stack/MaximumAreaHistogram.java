//Maximum Area Histogram
package stack;

import java.util.Stack;

public class MaximumAreaHistogram {
	public static void main(String[] args) {
		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		mah(arr);
	}

	public static void mah(int arr[]) {
		int len = arr.length;
		int right[] = nsr(arr, len);
		int left[] = nsl(arr, len);
		int width[] = new int[len];
		for (int i = 0; i < len; i++) {
			width[i] = right[i] - left[i] - 1;
		}
		int max = -1;
		int area;
		for (int i = 0; i < len; i++) {
			area = arr[i] * width[i];
			if (area > max) {
				max = area;
			}
		}
		System.out.println(max);
	}

	public static int[] nsr(int arr[], int n) {
		Stack<Pair> s = new Stack<>();
		int r[] = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			if (s.isEmpty()) {
				r[i] = n;
			} else if (!s.isEmpty() && s.peek().num <= arr[i]) {
				r[i] = s.peek().index;
			} else if (!s.isEmpty() && s.peek().num > arr[i]) {
				while (!s.isEmpty() && s.peek().num > arr[i]) {
					s.pop();
				}
				if (s.isEmpty()) {
					r[i] = n;
				} else {
					r[i] = s.peek().index;
				}
			}
			s.push(new Pair(arr[i], i));
		}
		return r;
	}

	public static int[] nsl(int arr[], int n) {
		Stack<Pair> s = new Stack<>();
		int r[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (s.isEmpty()) {
				r[i] = -1;
			} else if (!s.isEmpty() && s.peek().num <= arr[i]) {
				r[i] = s.peek().index;
			} else if (!s.isEmpty() && s.peek().num > arr[i]) {
				while (!s.isEmpty() && s.peek().num > arr[i]) {
					s.pop();
				}
				if (s.isEmpty()) {
					r[i] = -1;
				} else {
					r[i] = s.peek().index;
				}
			}
			s.push(new Pair(arr[i], i));
		}
		return r;
	}
}

class Pair {

	int num;
	int index;

	Pair(int num, int index) {
		this.num = num;
		this.index = index;
	}
}
