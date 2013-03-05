import unittest

from katas import wordwrap


class WordWrapTests(unittest.TestCase):
    def test_empty_string_does_not_wrap(self):
        self.assertEqual(wordwrap.wrap_text('', 5), '')

    def test_string_of_wrap_length_does_not_wrap(self):
        self.assertEqual(wordwrap.wrap_text('word word', 9), 'word word')

    def test_two_words_wrap(self):
        self.assertEqual(wordwrap.wrap_text('word word', 4), 'word\nword')

    def test_three_words_wrap(self):
        self.assertEqual(wordwrap.wrap_text('word word word', 4), 'word\nword\nword')

    def test_wrap_after_second_space(self):
        self.assertEqual(wordwrap.wrap_text('word word word', 9), 'word word\nword')

    def test_lines_always_break_at_width(self):
        self.assertEqual(wordwrap.wrap_text('wordwordword', 4), 'word\nword\nword')

    def test_wrap_after_word_boundary(self):
        self.assertEqual(wordwrap.wrap_text('word word', 3), 'wor\nd\nwor\nd')