package hashmap;

import java.util.HashSet;

public class PangramSentence {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}

	public static boolean checkIfPangram(String sentence) {
		HashSet<Character> hs = new HashSet<>();
		for (char c : sentence.toCharArray()) {
			hs.add(c);
		}
		return hs.size() == 26;
	}
}
