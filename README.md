# git1_array_dpp
Array DS dpp
Class Exercise on Arrays
Set A
1.	Create an array of integer with size n. Return the difference between the largest and the smallest value inside that array.
Definition of Done:
a) The program should ask user to enter the size and elements of the array.
b) The program should display the difference b/w the largest & smallest element.

2.	Write a program that initializes an array with ten random integers and then prints four lines of output, containing:
•	Every element at an even index
•	Every odd element
•	All elements in reverse order
•	Only the first and last element
Defining of done:
a)	Program should ask the user to input 10 integer values
b)	It should display the output line by line as asked in the question
c)	Finally, should ask the user to continue (Y) or quit (N)

3.	Write a program to read numbers in an integer array of size 5 and display the following:
i)	Sum of all the elements
ii)	Sum of alternate elements in the array
iii)	Second highest element in the array
Definition of Done
a)	The program should ask user to enter the elements of the array.
b)	The program should display a menu with the above choices and ask the user to                                                                       choose one of the choices.
c)	The program should display the result.
4. Write a program that count occurrence of a given number in the array and its frequency.
	Definition of Done:
a)	The program should ask user to enter the elements of the array
b)	The program should ask the user to enter a number to search and display the frequency of the searched element.



5. Write a program that reads a 2-D integer array with each element of maximum 2 digits and prints the following:
a) Elements of the entered array.
b) Elements of the array after each element is multiplied by 2 if it is an odd number.
 Definition of Done:
a)	The program should generate an error message if the number of digits in the array is more than two and ask the user to re-enter the number.
b)	The program should use continue statement for ignoring even elements.
c)	The array elements should be displayed in tabular form with width set to




Set B

6. Given an array of integers, return the number of times that two 6's are next to each other in the array. Also count instances where the second element is 7.
•	arrayFunc([6, 6, 2]) → 1
•	arrayFunc([6, 6, 2, 6]) → 1
•	arrayFunc([6, 7, 2, 6]) → 1
Definition of Done:
a)	Program should ask the user the array size & then input integer values
b)	In the next line It should print the number of occurrences of two 6’s
c)	It should also print the occurrences of ‘6’ followed by ‘7’
7.  Write a method called swapPairs() that accepts an array of integers and swaps the elements at adjacent indexes. That is, elements 0 and 1 are swapped, elements 2 and 3 are swapped, and so on. If the array has an odd length, the final element should be left unmodified. For example, the list {10, 20, 30, 40, 50} should become {20, 10, 40, 30, 50} after a call to your method.
Definition of Done:
a)	Program should ask the user to input array size and integer values
b)	In the next line, it should print the swapped elements as desired

8. Write a method called median() that accepts an array of integers as its argument and returns the median of the numbers in the array. The median is the number that will appear in the middle if you arrange the elements in order. Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the array are between 0 and 99 inclusive.
For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5 and the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25.
Similarly, in case of even size, the median would be the average of middle two numbers.
Definition of Done:
a)	Program should ask the user to enter the array size and input integer values
b)	The median() method should return the median of the array based on its size

9. Given an array of pairs of integers. The task is to sort the array with respect to second element of the pair.

	Example:
	Input: [(2, 1), (5, 3), (6, 2), (1, 7)]
		Output: [(1, 2), (3, 5), (2, 6), (1, 7)]

Definition of Done:
a)	Create a class Pair and store the pairs in an array
b)	Ask the user to enter the array size and elements into it
c)	Define a static function sort that sorts an array of pairs w.r.t the second element of the pair

10. Write a program that accepts an array of Strings as its argument and indicates whether that array is a palindrome—that is, it reads the same forwards as backwards.

•	For example, the array {"alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha"} is a palindrome.

Definition of Done:
a)	Program should ask the user to enter the array size and input String values
b)	In the next line, it should print whether the entered array is palindrome or not


Set C


11. Write a program that constructs a jagged two-dimensional array to represent pascals triangle. It takes advantage of the fact that, each value other than the 1s that appear in the beginning and at the end of each row is the sum of two values from the previous row.
For example:

Definition of Done:
a)	Program should ask the user to enter the number of rows to print
b)	Finally, it should display the pascals traingle

