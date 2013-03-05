package name.shawley.dave.katas.romannumerals;


public class RomanNumeralConverter {

	public String convertNumber(int aNumber) {
		StringBuffer sb = new StringBuffer();

		aNumber = handleSequence(aNumber, sb, "M", 1000, "C", 100);
		aNumber = handleSequence(aNumber, sb, "D", 500, "C", 100);
		aNumber = handleSequence(aNumber, sb, "C", 100, "X", 10);
		aNumber = handleSequence(aNumber, sb, "L", 50, "X", 10);
		aNumber = handleSequence(aNumber, sb, "X", 10, "I", 1);
		aNumber = handleSequence(aNumber, sb, "V", 5, "I", 1);
		aNumber = applyAdditive(aNumber, sb, "I", 1);

		return sb.toString();
	}

	private int handleSequence(int aNumber, StringBuffer accumulator, String symbol, int symbolValue, String nextSymbol, int nextValue) {
		aNumber = applyAdditive(aNumber, accumulator, symbol, symbolValue);
		if (aNumber >= (symbolValue - nextValue)) {
			accumulator.append(nextSymbol).append(symbol);
			aNumber -= (symbolValue - nextValue);
		}
		return aNumber;
	}

	private int applyAdditive(int aNumber, StringBuffer accumulator, String symbol, int symbolValue) {
		while (aNumber >= symbolValue) {
			accumulator.append(symbol);
			aNumber -= symbolValue;
		}
		return aNumber;
	}

}