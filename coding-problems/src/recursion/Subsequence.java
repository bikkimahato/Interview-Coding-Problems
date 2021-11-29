//Subsequence
package recursion;

import java.util.ArrayList;

public class Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> al = getSubsequence(s);
		System.out.println(al);
	}

	private static ArrayList<String> getSubsequence(String s) {
		if (s.length() == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}
		char ch = s.charAt(0);
		ArrayList<String> al = getSubsequence(s.substring(1));
		ArrayList<String> res = new ArrayList<>();

		for (String str : al) {
			res.add("" + str);
		}
		for (String str : al) {
			res.add(ch + str);
		}
		return res;
	}

}
