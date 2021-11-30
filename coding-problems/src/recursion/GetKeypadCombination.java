//Get Keypad Combination
package recursion;

import java.util.ArrayList;

public class GetKeypadCombination {

	static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void main(String[] args) throws Exception {
		String s = "78";
		ArrayList<String> al = getKPC(s);
		System.out.println(al);
	}

	public static ArrayList<String> getKPC(String str) {
		if (str.length() == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		}

		char ch = str.charAt(0);
		String end = str.substring(1);

		ArrayList<String> al = getKPC(end);
		ArrayList<String> res = new ArrayList<>();

		String codeCh = codes[ch - '0'];
		for (int i = 0; i < codeCh.length(); i++) {
			char chCode = codeCh.charAt(i);
			for (String rStr : al) {
				res.add(chCode + rStr);
			}
		}
		return res;
	}

}
