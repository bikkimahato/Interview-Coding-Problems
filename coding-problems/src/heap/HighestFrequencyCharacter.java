//Highest Frequency Character
package heap;

import java.util.HashMap;

public class HighestFrequencyCharacter {

	public static void main(String[] args) {
		String s = "thequickbrownfoxjumpedoverthelazydog";
		System.out.println(solveMaxFreq(s));

	}

	private static char solveMaxFreq(String s) {
		HashMap<Character, Integer> hm = new HashMap<>(); // HashMap solution only
		for (char ch : s.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}

		char maxCh = s.charAt(0);
		for (Character i : hm.keySet()) {
			if (hm.get(i) > hm.get(maxCh)) {
				maxCh = i;
			}
		}
		return maxCh;
	}

}
