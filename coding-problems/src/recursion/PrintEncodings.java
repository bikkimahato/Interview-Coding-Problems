//Print Encodings
/*1 -> a
2 -> b
3 -> c
..
25 -> y
26 -> z*/
package recursion;

public class PrintEncodings {

	public static void main(String[] args) {
		String s = "123";
		printEncodings(s, "");
	}

	public static void printEncodings(String str, String asf) {
		if (str.length() == 0) {
			System.out.println(asf);
			return;
		} else if (str.length() == 1) {
			char ch = str.charAt(0);
			if (ch == '0') {
				return;
			} else {
				int chV = ch - '0';
				char nch = (char) ('a' + chV - 1);
				asf += nch;
				System.out.println(asf);
				return;
			}
		} else {
			char ch = str.charAt(0);
			if (ch == '0') {
				return;
			} else {
				int chV = ch - '0';
				char nch = (char) ('a' + chV - 1);
				printEncodings(str.substring(1), asf + nch);
			}

			String ch12 = str.substring(0, 2);
			int ch12v = Integer.parseInt(ch12);
			if (ch12v <= 26) {
				char nch = (char) ('a' + ch12v - 1);
				printEncodings(str.substring(2), asf + nch);
			}
		}
	}
}
