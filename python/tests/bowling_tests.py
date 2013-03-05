import unittest

from katas import bowling


class BowlingKataTests(unittest.TestCase):
    def setUp(self):
        self.game = bowling.Game()
        self.rolls = 0

    def roll_multiple_balls_with_same_score(self, num_balls, ball_score):
        for _ in range(0, num_balls):
            self.roll_single_ball(ball_score)

    def roll_spare_starting_with(self, first_ball):
        self.roll_single_ball(first_ball)
        self.roll_single_ball(10 - first_ball)

    def roll_strike(self):
        self.roll_single_ball(10)
        self.rolls += 1  # strike counts as an entire frame

    def roll_single_ball(self, score):
        self.game.roll_ball_scoring(score)
        self.rolls += 1

    def finish_game_in_the_gutter(self):
        self.roll_multiple_balls_with_same_score(20 - self.rolls, 0)


    def test_gutter_game(self):
        self.finish_game_in_the_gutter()
        self.assertEquals(self.game.score, 0)

    def test_all_ones(self):
        self.roll_multiple_balls_with_same_score(20, 1)
        self.assertEquals(self.game.score, 20)

    def test_one_spare(self):
        self.roll_spare_starting_with(5)
        self.roll_single_ball(3)
        self.finish_game_in_the_gutter()
        self.assertEqual(self.game.score, 16)

    def test_one_strike(self):
        self.roll_strike()
        self.roll_single_ball(3)
        self.roll_single_ball(4)
        self.finish_game_in_the_gutter()
        self.assertEqual(self.game.score, 24)

    def test_perfect_game(self):
        self.roll_multiple_balls_with_same_score(12, 10)
        self.assertEqual(self.game.score, 300)

