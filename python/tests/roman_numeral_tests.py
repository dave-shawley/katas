import unittest

from katas.roman import number_to_numeral


class NumberConversionTests(unittest.TestCase):
    def test_zero_is_invalid(self):
        with self.assertRaises(ValueError):
            number_to_numeral(0)

    def test_numbers(self):
        test_map = {
            1: 'I', 2: 'II', 4: 'IV', 5: 'V', 8: 'VIII', 10: 'X', 12: 'XII',
            9: 'IX', 13: 'XIII', 14: 'XIV', 20: 'XX', 39: 'XXXIX', 40: 'XL',
            49: 'XLIX', 60: 'LX', 83: 'LXXXIII', 99: 'XCIX', 383: 'CCCLXXXIII',
            500: 'D', 494: 'CDXCIV', 988: 'CMLXXXVIII',
            750: 'DCCL', 789: 'DCCLXXXIX', 1888: 'MDCCCLXXXVIII', 1999: 'MCMXCIX',
            2001: 'MMI',
        }
        for k, v in test_map.items():
            self.assertEqual(number_to_numeral(k), v)
