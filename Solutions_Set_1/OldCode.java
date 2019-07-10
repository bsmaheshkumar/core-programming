package github;

import java.util.ArrayList;
import java.util.List;

public class OldCode {

	public ArrayList<String> oldCodeToNewCode(ArrayList<String> l1) {
		ArrayList<String> resultList = new ArrayList<String>();
		for (String str : l1) {
			String comments = "//";
			int commentIndex = str.trim().indexOf(comments);
			if (commentIndex == 0) {
				resultList.add(str);
			} else if (commentIndex == -1) {
				String processedString = processString(str);
				resultList.add(processedString);
			} else {
				String subString = str.substring(0, commentIndex);
				String processedString = processString(subString);
				resultList.add(processedString
						+ str.substring(commentIndex, str.length()));

			}
		}
		System.out.println(resultList);
		return resultList;
	}

	private static String processString(String str) {

		String s1 = str.replaceAll("->", ".");
		return s1;
	}
}
