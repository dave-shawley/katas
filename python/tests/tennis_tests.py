import unittest

from katas import tennis


class TennisKataTests(unittest.TestCase):
    def play_game(self, *score_sequence):
        """Call ``game.player_one_scores`` or ``game.player_two_scores``
        repeatedly based on the values in ``score_sequence``."""
        for player_num in score_sequence:
            if player_num == 1:
                self.game.player_one_scores()
            elif player_num == 2:
                self.game.player_two_scores()
            else:
                raise ValueError('illegal player number ' + str(player_num))

    def setUp(self):
        self.game = tennis.Game()

    def test_new_game_returns_love_all(self):
        self.assertEqual(self.game.score, tennis.ALL(tennis.LOVE))

    def test_player_one_scores(self):
        self.play_game(1)
        self.assertEqual(self.game.score, tennis.Score(tennis.FIFTEEN, tennis.LOVE))

    def test_game_with_one_score_each(self):
        self.play_game(1, 2)
        self.assertEqual(self.game.score, tennis.ALL(tennis.FIFTEEN))

    def test_player_two_scores_twice(self):
        self.play_game(2, 2)
        self.assertEqual(self.game.score, tennis.Score(tennis.LOVE, tennis.THIRTY))

    def test_player_one_scores_three_times(self):
        self.play_game(1, 1, 1)
        self.assertEqual(self.game.score, tennis.Score(tennis.FORTY, tennis.LOVE))

    def test_players_at_deuce(self):
        self.play_game(1, 1, 1, 2, 2, 2)
        self.assertEqual(self.game.score, tennis.DEUCE())

    def test_player_one_wins(self):
        self.play_game(1, 1, 1, 1)
        self.assertTrue(self.game.game_over)
        self.assertEqual(self.game.score, tennis.WIN(1))

    def test_player_two_wins(self):
        self.play_game(1, 2, 2, 2, 2)
        self.assertTrue(self.game.game_over)
        self.assertEqual(self.game.score, tennis.WIN(2))

    def test_play_until_deuce(self):
        # 15    0    15 Love
        # 30    0    30 Love
        # 30   15    30 15
        # 30   30    30 All
        # 40   30    40 30
        # 40   40    Deuce
        self.play_game(1, 1, 2, 2, 1, 2)
        self.assertEqual(self.game.score, tennis.DEUCE())

    @unittest.skip
    def test_player_two_has_advantage(self):
        # 15    0    15 Love
        # 30    0    30 Love
        # 40    0    40 Love
        # 40   15    40 15
        # 40   30    40 30
        # 40   40    Deuce
        # 40   *     Advantage 2
        self.play_game(1, 1, 1, 2, 2, 2, 2, 2)
        self.assertEqual(self.game.score, tennis.Score.ADVANTAGE(2))

    @unittest.skip
    def test_player_two_wins_after_advantage(self):
        self.play_game(1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2)
        self.assertTrue(self.game.game_over)
        self.assertEqual(self.game.score, tennis.Score.WIN(2))
