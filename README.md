# Day17

Exercise 1:
- Same result in mode 0 and 1. Counting from 0 to 9.
- Counting order is 'unruly' when the thread mode is on.

Exercise 2:
- I don't get the expected result, because the non-atomic instruction n++ is accessed by all threads.
- Synchronising the increase() method makes sure that the threads do not randomly increase the variable n.

Exercise 3:
- Two statements need to be synchronised, related to the update of the variable balance

Exercise 4:
-
