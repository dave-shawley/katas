package name.shawley.dave.katas.wordwrap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class WordWrapTests {

	@Test
	public void emptyStringDoesNotWrap() throws Exception {
		WordWrapper wrapper = new WordWrapper(1);
		assertThat(wrapper.wrapString(""), is(equalTo("")));
	}

	@Test
	public void wrapSingleCharacter() throws Exception {
		WordWrapper wrapper = new WordWrapper(1);
		assertThat(wrapper.wrapString("x"), is(equalTo("x")));
	}

	@Test
	public void wordsAreWrappedWithoutWhitespace() throws Exception {
		WordWrapper wrapper = new WordWrapper(1);
		assertThat(wrapper.wrapString("xx"), is(equalTo("x\nx")));
	}

	@Test // no change
	public void stringOfWrapLengthIsNotWrapped() throws Exception {
		WordWrapper wrapper = new WordWrapper(2);
		assertThat(wrapper.wrapString("xx"), is(equalTo("xx")));
	}

	@Test // no change
	public void wordIsSplitAtWrapLength() throws Exception {
		WordWrapper wrapper = new WordWrapper(2);
		assertThat(wrapper.wrapString("xxx"), is(equalTo("xx\nx")));
	}

	@Test
	public void singleWordIsWrappedMultipleTimes() throws Exception {
		WordWrapper wrapper = new WordWrapper(1);
		assertThat(wrapper.wrapString("xxx"), is(equalTo("x\nx\nx")));
	}

	@Test
	public void wordsWrapOnWhitespace() throws Exception {
		WordWrapper wrapper = new WordWrapper(1);
		assertThat(wrapper.wrapString("x x"), is(equalTo("x\nx")));
	}

	@Test
	public void wrappingOnWhitespaceIsPrefered() throws Exception {
		WordWrapper wrapper = new WordWrapper(2);
		assertThat(wrapper.wrapString("x x"), is(equalTo("x\nx")));
	}

	@Test // no change
	public void wrappingIsNotPerformedWhenUnnecessary() throws Exception {
		WordWrapper wrapper = new WordWrapper(3);
		assertThat(wrapper.wrapString("x x"), is(equalTo("x x")));
	}
	
	@Test // no change
	public void threeWordsWrapAtWrapWidth() throws Exception {
		WordWrapper wrapper = new WordWrapper(1);
		assertThat(wrapper.wrapString("x x x"), is(equalTo("x\nx\nx")));
	}

	@Test
	public void trailingWhitespaceIsTrimmed() throws Exception {
		WordWrapper wrapper = new WordWrapper(2);
		assertThat(wrapper.wrapString("x  x  x"), is(equalTo("x\nx\nx")));
	}

	@Test // no change
	public void whitespaceInLineIsPreserved() throws Exception {
		WordWrapper wrapper = new WordWrapper(3);
		assertThat(wrapper.wrapString("x x x"), is(equalTo("x x\nx")));
	}

}
