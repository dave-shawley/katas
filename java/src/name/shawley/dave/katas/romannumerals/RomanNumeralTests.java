package name.shawley.dave.katas.romannumerals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class RomanNumeralTests {
	private RomanNumeralConverter converter;

	@Before
	public void setUp() {
		converter = new RomanNumeralConverter();
	}

	@Test
	public void oneIsRepresentedAs_I() throws Exception {
		assertThat(converter.convertNumber(1), is(equalTo("I")));
	}

	@Test
	public void twoIsRepresentedAs_II() throws Exception {
		assertThat(converter.convertNumber(2), is(equalTo("II")));
	}

	@Test
	public void threeIsRepresentedAs_III() throws Exception {
		assertThat(converter.convertNumber(3), is(equalTo("III")));
	}

	@Test
	public void fiveIsRepresentedAs_V() throws Exception {
		assertThat(converter.convertNumber(5), is(equalTo("V")));
	}

	@Test
	public void fourIsRepresentedAs_IV() throws Exception {
		assertThat(converter.convertNumber(4), is(equalTo("IV")));
	}

	@Test
	public void sixIsRepresentedAs_VI() throws Exception {
		assertThat(converter.convertNumber(6), is(equalTo("VI")));
	}

	@Test
	public void sevenIsRepresentedAs_VII() throws Exception {
		assertThat(converter.convertNumber(7), is(equalTo("VII")));
	}

	@Test
	public void eightIsRepresetedAs_VIII() throws Exception {
		assertThat(converter.convertNumber(8), is(equalTo("VIII")));
	}

	@Test
	public void nineIsRepresentedAs_IX() throws Exception {
		assertThat(converter.convertNumber(9), is(equalTo("IX")));
	}

	@Test
	public void tenIsRepresentedAs_X() throws Exception {
		assertThat(converter.convertNumber(10), is(equalTo("X")));
	}

	@Test
	public void fourteenIsRepresentedAs_XIV() throws Exception {
		assertThat(converter.convertNumber(14), is(equalTo("XIV")));
	}

	@Test
	public void fifteenIsRepresentedAs_XV() throws Exception {
		assertThat(converter.convertNumber(15), is(equalTo("XV")));
	}

	@Test
	public void nineteenIsRepresentedAs_XIX() throws Exception {
		assertThat(converter.convertNumber(19), is(equalTo("XIX")));
	}

	@Test
	public void twentyIsRepresentedAs_XX() throws Exception {
		assertThat(converter.convertNumber(20), is(equalTo("XX")));
	}

	@Test
	public void thirtyNineIsRepresentedAs_XXXIX() throws Exception {
		assertThat(converter.convertNumber(39), is(equalTo("XXXIX")));
	}

	@Test
	public void fortyIsRepresentedAs_XL() throws Exception {
		assertThat(converter.convertNumber(40), is(equalTo("XL")));
	}

	@Test
	public void fiftyIsRepresentedAs_L() throws Exception {
		assertThat(converter.convertNumber(50), is(equalTo("L")));
	}

	@Test
	public void eightyNineIsRepresentedAs_LXXXIX() throws Exception {
		assertThat(converter.convertNumber(89), is(equalTo("LXXXIX")));
	}

	@Test
	public void ninetyIsRepresentedAs_XC() throws Exception {
		assertThat(converter.convertNumber(90), is(equalTo("XC")));
	}

	@Test
	public void threeHundredAndEightyNineIsRepresentedAs_CCCLXXXIX() throws Exception {
		assertThat(converter.convertNumber(389), is(equalTo("CCCLXXXIX")));
	}

	@Test
	public void ninetyFourIsRepresentedAs_XCIV() throws Exception {
		assertThat(converter.convertNumber(94), is(equalTo("XCIV")));
	}

	@Test
	public void threeHundredAndNinetyNineIsRepresentedAs_CCCXCIX() throws Exception {
		assertThat(converter.convertNumber(399), is(equalTo("CCCXCIX")));
	}

	@Test
	public void fiveHundredIsRepresentedAs_D() throws Exception {
		assertThat(converter.convertNumber(500), is(equalTo("D")));
	}

//	@Test
//	public void fourHundredAndNinetyFourIsRepresentedAs_CDXCIV() throws Exception {
//		assertThat(converter.convertNumber(494), is(equalTo("CDXCIV")));
//	}

	@Test
	public void nineHundredAndEightyEightIsRepresentedAs_CMLXXXVIII() throws Exception {
		assertThat(converter.convertNumber(988), is(equalTo("CMLXXXVIII")));
	}

//	@Test
//	public void sevenHundredAndFiftyIsRepresentedAs_DCCL() throws Exception {
//		assertThat(converter.convertNumber(750), is(equalTo("DCCL")));
//	}

//	@Test
//	public void sevenHundredAndEightyNineIsRepresentedAs_DCCLXXXIX() throws Exception {
//		assertThat(converter.convertNumber(789), is(equalTo("DCCLXXXIX")));
//	}

//	@Test
//	public void oneThousandEightHundredAndEightyEightIsRepresentedAs_MDCCCLXXXVIII() throws Exception {
//		assertThat(converter.convertNumber(1888), is(equalTo("MDCCCLXXXVIII")));
//	}

//	@Test
//	public void oneThousandNineHundredAndNinetyNineIsRepresentedAs_MCMXCIX() throws Exception {
//		assertThat(converter.convertNumber(1999), is(equalTo("MCMXCIX")));
//	}

//	@Test
//	public void twoThousandAndOneIsRepresentedAs_MMI() throws Exception {
//		assertThat(converter.convertNumber(2001), is(equalTo("MMI")));
//	}
}
