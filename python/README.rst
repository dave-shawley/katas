Coding Katas
============

This tree contains various coding Katas written up in Python.  These
were initially developed as a way to familiarize myself with the
quite excellent PyCharm_ editor.  The katas are meant as an exercise
in coding quite similar to Katas in martial arts.  I am not an
expert in martial arts but that is the supposed theory behind their
discovery by the XP community.

Preparing the Environment
*************************

The easiest way to work with the katas is to install a virtual python
environment and work within it.  The code should work with either Python
2.7 or newer.  I have tested it with both 2.7 and 3.2 virtual environments.
The following sections describe the easiest way to set up a good environment
under different Python versions.

If you are using a Python older than 3.3, then download the most recent
version of ``virtualenv`` from
`PyPI <https://pypi.python.org/packages/source/v/virtualenv/>`_ and extract it
into the current directory.  The following sections refer to the new directory
as *VENVDIR*.

Python 2.7
----------
::

  prompt$ python2.7 VENVDIR/virtualenv.py --no-site-packages env-2.7
  prompt$ source env-2.7/bin/activate
  (env-2.7)prompt$ pip install -r requirements.txt

Python 3.2
----------
::

  prompt$ python3.2 VENVDIR/virtualenv.py --no-site-packages env-3.2
  prompt$ source env-3.2/bin/activate
  (env-3.2)prompt$ pip install -r requirements.txt

Python 3.3
----------
::

  prompt$ pyvenv-3.3 env-3.3
  prompt$ source env-3.3/bin/activate
  (env-3.3) prompt$ curl http://python-distribute.org/distribute_setup.py | python
  (env-3.3) prompt$ curl https://raw.github.com/pypa/pip/master/contrib/get-pip.py | python
  (env-3.3) prompt$ pip install -r requirements.txt


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

