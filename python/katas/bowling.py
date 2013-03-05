

class Game:
    def __init__(self):
        self.rolls = []

    def score_each_frame(self):
        """Generates a score for each frame."""
        roll_index = 0
        for frame in range(0, 10):
            simple_score = self.rolls[roll_index] + self.rolls[roll_index + 1]
            if self.is_frame_a_strike(roll_index):
                yield simple_score + self.rolls[roll_index + 2]
                roll_index += 1
            elif self.is_frame_a_spare(roll_index):
                yield simple_score + self.rolls[roll_index + 2]
                roll_index += 2
            else:
                yield simple_score
                roll_index += 2

    def roll_ball_scoring(self, roll_score):
        """Record rolling a ball that scored ``roll_score``."""
        self.rolls.append(roll_score)

    def is_frame_a_spare(self, roll_index):
        """Was the frame starting at ``roll_index`` a spare?"""
        return self.rolls[roll_index] + self.rolls[roll_index + 1] == 10

    def is_frame_a_strike(self, roll_index):
        """Was the frame starting at ``roll_index`` a strike?"""
        return self.rolls[roll_index] == 10

    @property
    def score(self):
        return sum(self.score_each_frame())

