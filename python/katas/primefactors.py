

def generate(a_number):
    """Answers the prime factorization of ``a_number``."""
    factors = []
    current_prime = 2
    while a_number > 1:
        while a_number % current_prime == 0:
            factors.append(current_prime)
            a_number //= current_prime
        current_prime += 1
    return factors
