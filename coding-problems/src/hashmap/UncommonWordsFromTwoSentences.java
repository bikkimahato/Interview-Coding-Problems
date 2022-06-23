package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

	public static void main(String[] args) {
		String s1 = "this apple is sweet", s2 = "this apple is sour";
		String arr[] = uncommonFromSentences(s1, s2);
		for (String s : arr) {
			System.out.print(s + " ");
		}
	}

	public static String[] uncommonFromSentences(String s1, String s2) {
		Map<String, Integer> count = new HashMap<>();
		for (String w : (s1 + " " + s2).split(" "))
			count.put(w, count.getOrDefault(w, 0) + 1);
		ArrayList<String> res = new ArrayList<>();
		for (String w : count.keySet())
			if (count.get(w) == 1)
				res.add(w);
		return res.toArray(new String[0]);
	}
}
