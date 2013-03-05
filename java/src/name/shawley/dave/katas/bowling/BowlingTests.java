package name.shawley.dave.katas.bowling;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class BowlingTests {
	private BowlingGame game;

	@Before
	public void setUp() {
		game = new BowlingGame();
	}

	@Test
	public void gutterGameScoresZero() throws Exception {
		rollMultipleTimes(20, 0);
		assertThat(game.score(), is(equalTo(0)));
	}

	@Test
	public void allOnesScoresTwenty() throws Exception {
		rollMultipleTimes(20, 1);
		assertThat(game.score(), is(equalTo(20)));
	}

	@Test
	public void oneStrikeScoresTen() throws Exception {
		game.registerScore(10);
		rollMultipleTimes(18, 0);
		assertThat(game.score(), is(equalTo(10)));
	}

	@Test(expected = GameOverException.class)
	public void normalGameHasTwentyRolls() throws Exception {
		rollMultipleTimes(20, 0);
		game.registerScore(0);
	}

	@Test
	public void spareCountsNextBallTwice() throws Exception {
		rollSpareStartingWith(4);
		game.registerScore(4);
		rollMultipleTimes(17, 0);
		assertThat(game.score(), is(equalTo(4 + 6 + (4 * 2))));
	}

	@Test
	public void testGameOfAllSpares() throws Exception {
		rollSpareStartingWith(4);
		for (int frame=1; frame < 10; ++frame) {
			rollSpareStartingWith(frame);
		}
		game.registerScore(7);
		assertThat(game.score(), is(equalTo(152)));
	}

	@Test
	public void strikeCountsNextTwoBallsTwice() throws Exception {
		game.registerScore(10);
		game.registerScore(4);
		game.registerScore(5);
		rollMultipleTimes(16, 0);
		assertThat(game.score(), is(equalTo(28)));
	}

	@Test
	public void perfectGameScoreIs300() throws Exception {
		rollMultipleTimes(12, 10);
		assertThat(game.score(), is(equalTo(300)));
	}


	private void rollMultipleTimes(int numTimes, int numPins) throws GameOverException {
		for (int i=0; i<numTimes; ++i) {
			game.registerScore(numPins);
		}
	}

	private void rollSpareStartingWith(int ball) throws GameOverException {
		game.registerScore(ball);
		game.registerScore(10 - ball);
	}
}

