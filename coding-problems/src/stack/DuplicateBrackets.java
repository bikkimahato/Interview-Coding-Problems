//Duplicate Brackets
package stack;

import java.util.Stack;

public class DuplicateBrackets {

	public static void main(String[] args) {
		String s = "(a + b) + ((c + d))";
		System.out.println(hasDuplicate(s));

	}

	private static boolean hasDuplicate(String s) {
		Stack<Character> sc = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == ')') {
				if (sc.peek() == '(') {
					return true;
				} else {
					while (sc.peek() != '(') {
						sc.pop();
					}
					sc.pop();
				}
			} else {
				sc.push(ch);
			}

		}
		return false;
	}

}
