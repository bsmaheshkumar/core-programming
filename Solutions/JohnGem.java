import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class is responsible for finding the number of gem elements.
 * 
 * @author kumar Kaushal
 * 
 */
public class JohnGem {

	/**
	 * This method finds out the number of gem element present in rocks.An element
	 * is called a gem-element if it occurs at least once in each of the rocks.
	 * 
	 * @param rocks
	 *            list of rocks
	 * @return number of gem element
	 */
	public int findNumberofGemElement(List<String> rocks) {
		if (rocks != null && !rocks.isEmpty()) {
			Set<Character> gemElement = convertToSet(rocks.get(0));

			for (int i = 1; i < rocks.size(); i++) {
				// retailAll - Retains only the elements in this set that are contained in the specified collection
				gemElement.retainAll(convertToSet(rocks.get(i)));
			}

			return gemElement.size();
		} else {
			return 0;
		}
	}

	/**
	 * Method converts string to set of characters
	 * 
	 * @param rock as string to be converted to set
	 * @return set of characters created from String
	 */
	private Set<Character> convertToSet(String rock) {
		Set<Character> set = new HashSet<Character>();
		for (Character character : rock.toCharArray()) {
			set.add(character);
		}
		return set;
	}
}
