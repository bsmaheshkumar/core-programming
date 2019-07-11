/**
 * This class is responsible for reducing the string as much as possible
 * 
 * @author Kumar Kaushal
 *
 */
public class NonReducible {
	
	/**
	 * operation Count for reducing the string
	 */
	private int operationCount;
	/**
	 * final reduced string
	 */
	private String reducedString;
		
	public NonReducible() {
		
	}
	
	public NonReducible(int operationCount, String reducedString) {
		this.operationCount = operationCount;
		this.reducedString = reducedString;
	}

	public int getOperationCount() {
		return operationCount;
	}

	public void setOperationCount(int operationCount) {
		this.operationCount = operationCount;
	}

	public String getReducedString() {
		return reducedString;
	}

	public void setReducedString(String reducedString) {
		this.reducedString = reducedString;
	}

	/**
	 * This method takes the input parameter, reduce it as much as possible and
	 * also find out the count of operations needed to reduce it.
	 * 
	 * @param stringToBeReduced string to be reduced
	 * @return NonReducible instance with reduced string and operation count set in that
	 * 
	 */
	public NonReducible findReducedStringAndOperationCount(String stringToBeReduced) {
		this.operationCount = 0;
		String reducibleString = "";
		NonReducible nonReducible = new NonReducible();

		if (stringToBeReduced != null && !stringToBeReduced.isEmpty()) {
			for (int i = 0; i < stringToBeReduced.length() - 1;) {
				char[] inputCharArr = stringToBeReduced.toCharArray();

				if (inputCharArr[i] == inputCharArr[i + 1]) {
					String leftSubString = stringToBeReduced.substring(0, i); // startIndex inclusive and endIndex exclusive
					String rightSubString = stringToBeReduced.substring(i + 2);
					reducibleString = leftSubString + rightSubString;
					stringToBeReduced = reducibleString;
					operationCount++;
				} else {
					i++;
				}
			}
			nonReducible.setOperationCount(operationCount);
			nonReducible.setReducedString(stringToBeReduced);
		}
		else {
			nonReducible.setOperationCount(0);
			nonReducible.setReducedString("");
		}
		return nonReducible;
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof NonReducible) {
			NonReducible nonReducibleInstance = (NonReducible) obj;
			if (this.operationCount == nonReducibleInstance.getOperationCount()
					&& this.reducedString.equals(nonReducibleInstance
							.getReducedString())) {
				result = true;
			}
		}
		return result;
	}

}
