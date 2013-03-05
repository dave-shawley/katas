============
Coding Katas
============

This tree contains various coding Katas written up in Python.  These
were initially developed as a way to familiarize myself with the
quite excellent PyCharm_ editor.  The katas are meant as an exercise
in coding quite similar to Katas in martial arts.  I am not an
expert in martial arts but that is the supposed theory behind their
discovery by the XP community.

*************************
Preparing the Environment
*************************

The easiest way to work with the katas is to install a virtual python
environment and work within it.  The code should work with either Python
2.7 or newer.  I have tested it with both 2.7 and 3.2 virtual environments.

1. Install `virtualenv`_
2. Install the testing environment with ``pip install -r requirements.txt``
3. Run all of the tests with ``nosetests`` or a specific test by naming it
   as a parameter to ``nosetests``.

***************
Using the Katas
***************

Katas are nothing more than repeated programming exercises that are
usually done in a test-driven manner.  Start by removing the source
code associated with one or all of the katas.  Each kata is
represented by a single module in the ``katas`` package.

Next edit the tests that make up the kata and use `unittest.skip`_
to skip each test method.  Then remove ``@skip`` from the first
method, run the test using ``nosetests``, and add the code that makes
the test *go green*.

.. _PyCharm: http://www.jetbrains.com/pycharm/
.. _unittest.skip: http://docs.python.org/3/library/unittest.html#skipping-tests-and-expected-failures
.. _virtualenv: http://www.virtualenv.org/

.. vim: set filetype=rst textwidth=78 tabstop=3 expandtab:
