package name.shawley.dave.katas.bowling;


public class BowlingGame {
	private int currentIndex = 0;
	private int[] scores = new int[22];

	public void registerScore(final int numPins) throws GameOverException {
		if (currentIndex >= 20) {
			if (!(currentIndex == 20 && spareStartingWithBall(currentIndex - 2))) {
				throw new GameOverException();
			}
		}
		scores[currentIndex] = numPins;
		currentIndex++;
	}

	public int score() {
		int score = 0;
		int ballIndex = 0;
		for (int frame=0; frame<10; ++frame) {
			if (isStrike(ballIndex)) {
				score += scores[ballIndex] + (scores[ballIndex + 1] + scores[ballIndex + 2]);
				++ballIndex;
			} else if (spareStartingWithBall(ballIndex)) {
				score += scores[ballIndex] + scores[ballIndex + 1] + (scores[ballIndex + 2]);
				ballIndex += 2;
			} else {
				score += scores[ballIndex] + scores[ballIndex + 1];
				ballIndex += 2;
			}
		}
		// while (ballIndex < currentIndex) {
		// 	score += scores[ballIndex];
		// 	if (isStrike(ballIndex)) {
		// 		score += (scores[ballIndex + 1] + scores[ballIndex + 2]);
		// 	} else if (spareStartingWithBall(ballIndex)) {
		// 		score += (scores[ballIndex + 1] + scores[ballIndex + 2]);
		// 		ballIndex ++;
		// 	}
		// 	ballIndex ++;
		// }
		return score;
	}

	private boolean spareStartingWithBall(final int ballIndex) {
		return (scores[ballIndex] + scores[ballIndex + 1] == 10);
	}

	private boolean isStrike(final int ballIndex) {
		return scores[ballIndex] == 10;
	}
}

