# HackerRank
1) Make it Anagram
-Alice recently started learning about cryptography and wants to create her own encryption method. Alice decides to generate a random seed for her encryption by transforming two strings into anagrams by removing characters from each string as necessary.

-Two words are anagrams of each other if the first word's letters can be rearranged to form the second word. So, the two strings must have the same characters (in any order) and the same length. For instance, given the strings ab and cba , Alice can remove the c from cba to have ba which is an anagram of ab. The minimum number of operations performed to create the anagram is 1, so that will be her seed value.

-Your challenge is to complete a line of code to calculate this seed value. You will be given two strings and must cumulate the minimum number of characters that must be removed from each string to create an anagram.

2) Professor Sam Grading
At HackerLand University, a passing grade is any grade 40 points or higher on a 100 point scale. Sam is a professor at the university and likes to round each student’s grade according to the following rules:

-If the difference between the grade and the next higher multiple of 5 is less than 3, round to the next higher multiple of 5
-If the grade is less than 38, don’t bother as it’s still a failing grade
-Automate the rounding process then round a list of grades and print the results.

Sample Input 0

4 //denotes the total no of students.
73
67
38
33
Sample Output 0

75
67
40
33
