LOVE = 0
FIFTEEN = 1
THIRTY = 2
FORTY = 3


class Score(object):
    def __init__(self, player_one_score, player_two_score):
        self._points = [player_one_score, player_two_score]

    def call_score(self, player_number):
        self._points[player_number - 1] += 1

    def __repr__(self):
        return '{}({}, {})'.format(
            self.__class__.__name__, self._points[0], self._points[1])

    def __eq__(self, other):
        return self._points == other._points


class ALL(Score):
    def __init__(self, score):
        super(ALL, self).__init__(score, score)


class DEUCE(Score):
    def __init__(self):
        super(DEUCE, self).__init__(FORTY, FORTY)


class WIN(Score):
    def __init__(self, winning_player):
        super(WIN, self).__init__(-1, -1)
        self._winner_index = winning_player - 1

    def __repr__(self):
        return 'Win({})'.format(self._winner_index + 1)

    def __eq__(self, other):
        return other._points[self._winner_index] > FORTY


class Game(object):
    def __init__(self):
        self._game_score = Score(LOVE, LOVE)

    def player_one_scores(self):
        self._game_score.call_score(1)

    def player_two_scores(self):
        self._game_score.call_score(2)

    @property
    def score(self):
        return self._game_score

    @property
    def game_over(self):
        return True
