package stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
	public static void main(String[] args) {
		int price[] = { 10, 4, 5, 90, 120, 80 };
		int n = price.length;

		int arr[] = calculateSpan(price, n);
		System.out.print(Arrays.toString(arr));
	}

	public static int[] calculateSpan(int price[], int n) {
		Stack<Pair> s = new Stack<>();
		int r[] = new int[n];
		for (int i = 0; i < n; i++) {
			if (s.isEmpty()) {
				r[i] = -1;
			} else if (!s.isEmpty() && s.peek().num > price[i]) {
				r[i] = s.peek().index;
			} else if (!s.isEmpty() && s.peek().num <= price[i]) {
				while (!s.isEmpty() && s.peek().num <= price[i]) {
					s.pop();
				}
				if (s.isEmpty()) {
					r[i] = -1;
				} else {
					r[i] = s.peek().index;
				}
			}
			s.push(new Pair(price[i], i));
		}

		for (int i = 0; i < n; i++) {
			r[i] = i - r[i];
		}
		return r;
	}

}
