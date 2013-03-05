import unittest

from katas import primefactors


class PrimeFactorsTest(unittest.TestCase):
    def test_one(self):
        self.assertEqual([], primefactors.generate(1))

    def test_two(self):
        self.assertEqual([2], primefactors.generate(2))

    def test_three(self):
        self.assertEqual([3], primefactors.generate(3))

    def test_four(self):
        self.assertEqual([2, 2], primefactors.generate(2 ** 2))

    def test_five(self):
        self.assertEqual([5], primefactors.generate(5))

    def test_six(self):
        self.assertEqual([2, 3], primefactors.generate(2 * 3))

    def test_seven(self):
        self.assertEqual([7], primefactors.generate(7))

    def test_eight(self):
        self.assertEqual([2, 2, 2], primefactors.generate(2 ** 3))

    def test_nine(self):
        self.assertEqual([3, 3], primefactors.generate(3 ** 2))

    def test_eighteen(self):
        self.assertEqual([2, 3, 3], primefactors.generate(2 * 3 * 3))

    def test_thirty(self):
        self.assertEqual([2, 3, 5], primefactors.generate(2 * 3 * 5))

