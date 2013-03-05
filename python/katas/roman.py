NUMBER_SYSTEM = {
    1000: ('M', 'C', 100),
    500: ('D', 'C', 100),
    100: ('C', 'X', 10),
    50: ('L', 'X', 10),
    10: ('X', 'I', 1),
    5: ('V', 'I', 1),
    1: ('I', '', 0)
}


def number_to_numeral(a_number):
    """Answers a roman numeral string representing ``a_number``."""
    if a_number == 0:
        raise ValueError('{} is not a valid value'.format(a_number))
    the_numeral = ''
    for current_base in reversed(sorted(NUMBER_SYSTEM.keys())):
        current_digit, next_digit, next_base = NUMBER_SYSTEM[current_base]
        factor, a_number = divmod(a_number, current_base)
        the_numeral += factor * current_digit
        if a_number >= (current_base - next_base):
            the_numeral += next_digit + current_digit
            a_number -= (current_base - next_base)
    return the_numeral
