import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for converting an old code for a new version of the compiler.
 * @author Kumar Kaushal
 *
 */
public class OldCode {
	
	/**
	 * This method takes the old code as list of strings and update the old pointer with new one
	 * so as make it compatible with the new compiler. This update should not happen for comments. 
	 * 
	 * @param oldCodeList old code lines as list of strings 
	 * @return list of strings after updating the pointer
	 */
	public List<String> convertOldCodeForNewVersionCompiler(List<String> oldCodeList) {
		String updatedCodeLine = "";
		List<String> updatedCode = new ArrayList<String>();

		if (oldCodeList != null && !oldCodeList.isEmpty()) {
			for (String oldCode : oldCodeList) {
				int indexOfComment = oldCode.indexOf("//");
				if (indexOfComment != -1) {
					String comment = oldCode.substring(indexOfComment);
					String codeWithoutComment = oldCode.substring(0,
							indexOfComment);

					codeWithoutComment = codeWithoutComment.replaceAll("->", ".");
					updatedCodeLine = codeWithoutComment + comment;
					updatedCode.add(updatedCodeLine);
				} else {
					updatedCodeLine = oldCode.replaceAll("->", ".");
					updatedCode.add(updatedCodeLine);
				}
			}
		}
		return updatedCode;
	}
	
	/*public static void main(String[] args) {
		OldCode obj = new OldCode();
		List<String> oldCode = new ArrayList<String>();
		oldCode.add("int t; //variable t, t->a=0;  //t->a does something, return 0;");
		oldCode.add("int t->a; //variable t, t->a=0;");
		oldCode.add("int i->j, k->l;  //variable i->j, k->l");
		System.out.println(obj.convertOldCodeForNewVersionCompiler(oldCode).toString());
	}*/
}