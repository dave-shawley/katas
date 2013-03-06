Training Katas
==============

This repo contains a number of coding katas written in *TDD fashion*.  For
more information about the practice of "Code Kata", `Pragmatic Dave has written
a bunch of blog entries`__ and the like on it.  Here's a quote from the
CodeKata_ page that pretty much sums it up:

  How do you get to be a great musician? It helps to know the theory, and to
  understand the mechanics of your instrument. It helps to have talent. But
  ultimately, greatness comes from practicing; applying the theory over and
  over again, using feedback to get better every time.

  How do you get to be an All-Star sports person? Obviously fitness and talent
  help. But the great athletes spend hours and hours every day, practicing.

  But in the software industry we take developers trained in the theory and
  throw them straight in to the deep-end, working on a project. It’s like
  taking a group of fit kids and telling them that they have four quarters to
  beat the Redskins (hey, we manage by objectives, right?). In software we do
  our practicing on the job, and that’s why we make mistakes on the job. We
  need to find ways of splitting the practice from the profession. We need
  practice sessions.

So that is what this repo is all about.  It contains a bunch of katas that I
find useful in various programming languages.

.. _CodeKata: http://codekata.pragprog.com/2007/01/code_kata_backg.html#more
__ CodeKata_


Bowling Game
------------

The goal of this kata is to develop a program that calculates the score for a
standard bowling game.  This is a fairly famous Uncle Bob TDD example.  The
design is simple - create a ``Game`` class that is responsible for tracking
the state of the game and calculating the score.  Here are the tests:

1. a game of 20 rolls scoring zero each has a score of zero
2. a game of 20 rolls scoring one each has a score of 20
3. a game starting with rolls of 5, 5, and 3 followed by 17 gutter balls
   has a score of 16
4. a game starting with a roll of 10, 3, and 4 followed by 16 gutter balls
   has a score of 24
5. a game consisting of 12 consective rolls of 10 has a score of 300


Prime Factorization
-------------------

This is another Uncle Bob classic.  The goal is to implement a stateless
function that returns the prime factorization of an integer in order.  In
Java, a "stateless" function is a class with a ``static`` method.  Here are
the tests:

1. the prime factorization of ``1`` is an empty list
2. the prime factorization of ``2`` is a singleton list containing ``2``
3. the prime factorization of ``3`` is a singleton list containing ``3``
4. the prime factorization of ``4`` is the list ``[2, 2]``
5. the prime factorization of ``5`` is a singleton list containing ``5``
6. the prime factorization of ``6`` is the list ``[2, 3]``
7. the prime factorization of ``7`` is a singleton list containing ``7``
8. the prime factorization of ``8`` is the list ``[2, 2, 2]``
9. the prime factorization of ``9`` is the list ``[3, 3]``
10. the prime factorization of ``18`` is the list ``[2, 3, 3]``
11. the prime factorization of ``30`` is the list ``[2, 3, 5]``


Roman Numerals
--------------

I came across this kata on `codingdojo.com`_.  The goal is to create a
stateless function that takes an integer value and returns the string of
`Roman Numerals`_ that represent the number.  Here are the test cases.

====== ======   ====== ========   ====== ==========   ====== =============
Input  Output   Input  Output     Input  Output       Input  Output
====== ======   ====== ========   ====== ==========   ====== =============
    1   I           9   IX           60  LX             750  DCCL
    2   II         13   XIII         83  LXXXIII        789  DCCLXXXIX
    3   III        14   XIV          99  XCIX          1888  MDCCCLXXXVIII
    4   IV         20   XX          383  CCCLXXXIII    1999  MCMXCIX
    8   VIII       39   XXXIX       500  D             2001  MMI
   10   X          40   XL          494  CDXCIV         
   12   XII        49   XLIX        988  CMLXXXVIII
====== ======   ====== ========   ====== ==========   ====== =============

.. _codingdojo.com: http://codingdojo.org/cgi-bin/wiki.pl?KataRomanNumerals
.. _Roman Numerals: http://www.novaroma.org/via_romana/numbers.html


Word Wrapping
-------------

This one came from a TDD boot camp that Uncle Bob gave in Philadelphia in
early 2012.  The goal is to create a stateless function that wraps a string
to a specified character width by replacing a whitespace character with a
newline.  Here are the test cases:

============   ==========   ===========
Input String   Wrap Width   Output
============   ==========   ===========
""                 1        ""
"x"                1        "x"
"xx"               1        "x\\nx"
"xx"               2        "xx"
"xxx"              2        "xx\\nx"
"xxx"              1        "x\\nx\\nx"
"x x"              1        "x\\nx"
"x x"              2        "x\\nx"
"x x"              3        "x x"
"x x x"            1        "x\\nx\\nx"
"x x x"            2        "x\\nx\\nx"
"x x x"            3        "x x\\nx"
============   ==========   ===========
