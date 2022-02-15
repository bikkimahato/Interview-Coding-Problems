//Balanced Brackets/Valid Parentheses
package stack;

import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) {
		String s = "[(a + b) + {(c + d) * (e / f)}";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		Stack<Character> sc = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				sc.push(ch);
			} else if (ch == ')') {
				if (!sc.isEmpty() && sc.peek() == '(') {
					sc.pop();
				} else {
					return false;
				}
			} else if (ch == '}') {
				if (!sc.isEmpty() && sc.peek() == '{') {
					sc.pop();
				} else {
					return false;
				}
			} else if (ch == ']') {
				if (!sc.isEmpty() && sc.peek() == '[') {
					sc.pop();
				} else {
					return false;
				}
			}
		}
		if (sc.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
