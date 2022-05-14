package stack;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
	int min;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Stack<Integer> s = new Stack<>();
			GfG g = new GfG();
			while (!g.isFull(s, n)) {
				g.push(sc.nextInt(), s);
			}
			System.out.println(g.min(s));
		}
		sc.close();
	}
}

class GfG {
	int min;

	public void push(int a, Stack<Integer> s) {
		// add code here.
		if (s.isEmpty()) {
			min = a;
			s.push(a);
			return;
		} else {
			if (a < min) {
				s.push((2 * a - min));
				min = a;
			} else {
				s.push(a);
			}
		}

	}

	public int pop(Stack<Integer> s) {
		// add code here.
		if (s.isEmpty()) {
			return -1;
		} else {
			int x = s.pop();
			if (x < min) {
				min = 2 * min - x;
			}
			return x;
		}
	}

	public int min(Stack<Integer> s) {
		// add code here.
		if (!s.isEmpty())
			return min;
		else
			return -1;
	}

	public boolean isFull(Stack<Integer> s, int n) {
		// add code here.
		return s.size() == n;
	}

	public boolean isEmpty(Stack<Integer> s) {
		// add code here.
		return s.isEmpty();
	}
}