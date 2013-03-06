package name.shawley.dave.katas.wordwrap;


public class WordWrapper {
	private int wrapWidth;

	public WordWrapper(final int wrapWidth) {
		this.wrapWidth = wrapWidth;
	}

	public String wrapString(String raw) {
		StringBuffer output = new StringBuffer();
		while (raw.length() > wrapWidth) {
			int pos = findSplitPosition(raw);
			output.append(raw.substring(0, pos)).append("\n");
			raw = raw.substring(fastForwardOverWhitespace(raw, pos));
		}
		output.append(raw);
		return output.toString();
	}

	/**
	 * Locate the split position.
	 * @param raw  the string to split
	 * @return the position to split the string at
	 */
	private int findSplitPosition(String raw) {
		int pos = raw.lastIndexOf(" ", wrapWidth);
		pos = rewindOverWhitespace(raw, pos < 0 ? wrapWidth : pos);
		return pos;
	}

	/**
	 * Skip a span of whitespace starting at {@code offset}.
	 * @param s  the string to scan
	 * @param offset  the offset to start scanning at
	 * @return the offset of the first non-whitespace character 
	 */
	private int fastForwardOverWhitespace(String s, int offset) {
		while (s.charAt(offset) == ' ') {
			++offset;
		}
		return offset;
	}

	/**
	 * Skip whitespace preceding offset.
	 * <p>
	 * This method scans a string starting at {@code offset} and rewinds over
	 * whitespace until a non-whitespace character is found.
	 * 
	 * @param s  the string to scan
	 * @param offset  the offset to start at
	 * @return the offset of the earliest whitespace
	 */
	private int rewindOverWhitespace(String s, int offset) {
		if (s.charAt(offset) != ' ') {
			return offset;
		}
		while (s.charAt(offset) == ' ') {
			--offset;
		}
		return offset + 1;
	}

}
