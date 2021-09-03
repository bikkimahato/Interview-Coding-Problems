//Count Occurrences Of Anagrams
//Given a word pattern and a text. Return the count of the occurrences of anagrams of the word in the text.

package sliding_window;

import java.util.HashMap;

public class CountOccurrencesOfAnagrams {

	public static void main(String[] args) {
		String text = "forxxorfxdofr";
		String pattern = "for";
		System.out.println(solve(text, pattern));
	}

	private static int solve(String text, String pattern) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char ch : pattern.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		int count = hm.size();
		int j = 0, i = 0, ans = 0;
		while (j < text.length()) {
			char ch = text.charAt(j);
			if (hm.containsKey(ch) && count != 0) {
				hm.put(ch, hm.get(ch) - 1);
				if (hm.get(ch) == 0) {
					count--;
				}
			}

			if (j - i + 1 == pattern.length()) {
				if (count == 0) {
					ans++;
				}
				if (hm.containsKey(text.charAt(i))) {
					hm.put(text.charAt(i), hm.get(text.charAt(i)) + 1);
					if (hm.get(text.charAt(i)) == 1) {
						count++;
					}
				}
				i++;
			}
			j++;
		}
		return ans;
	}

}
