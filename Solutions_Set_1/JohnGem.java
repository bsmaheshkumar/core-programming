package github;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class JohnGem {

	public int JohnGemCheck(ArrayList<String> l1) {

		if (!l1.isEmpty()) {
			char[] charArr = l1.get(0).toCharArray();
			HashMap<Character, Boolean> hs = new HashMap<Character, Boolean>();
			HashMap<Character, Boolean> shs = new HashMap<Character, Boolean>();
			for (char ch : charArr) {
				hs.put(ch, true);
			}

			for (int i = 1; i < l1.size(); i++) {

				for (char ch : l1.get(i).toCharArray()) {

					if (hs.containsKey(ch) && hs.get(ch))
						shs.put(ch, true);
				}

				Set<Character> set = shs.keySet();

				hs.clear();
				for (Character ch : set) {
					hs.put(ch, true);
				}

				shs.clear();

			}

			System.out.println("Size: "+hs.size());
			return (hs.size());

		} else {
			System.out.println("List is empty!!");
			return -1;
		}
	}
}
