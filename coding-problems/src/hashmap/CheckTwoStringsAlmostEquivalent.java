package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CheckTwoStringsAlmostEquivalent {

	public static void main(String[] args) {
		String word1 = "abcdeef", word2 = "abaaacc";
		System.out.println(checkAlmostEquivalent(word1, word2));
	}

	public static boolean checkAlmostEquivalent(String word1, String word2) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < word1.length(); i++) {
			map.put(word1.charAt(i), map.getOrDefault(word1.charAt(i), 0) + 1);
			map.put(word2.charAt(i), map.getOrDefault(word2.charAt(i), 0) - 1);
		}
		for (int i : map.values()) {
			if (i > 3 || i < -3) {
				return false;
			}
		}
		return true;
	}
}
