Given a string, s, the objective is to convert it into integer format without utilizing any built-in functions. 
  If the conversion is not feasible, the function should return -1.

Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' and rest are numeric.

Example 1:

Input:
s = "-123"
Output: 
-123
Explanation:
It is possible to convert -123 into an integer 
and is so returned in the form of an integer
Example 2:

Input:
s = "21a"
Output: 
-1
Explanation: 
The output is -1 as, due to the inclusion of 'a',
the given string cannot be converted to an integer.
Your Task:
You do not have to take any input or print anything. Complete the function atoi() which 
  takes a string s as an input parameter and returns an integer value representing the given string. If the conversion is not feasible, 
  the function should return -1.




Solution:

class Solution
{
    int atoi(String s) {
	// Your code here
	
	/*
	Approach:
	1. Check if he the 1st element in the string is -
	2. The check if the elements in the string is between 0 and 9 else return -1
	    Along with the check add this into integer variable by int a=(a*10) + s[i]-'0')
	3. Coming back to 1st char is neg or not, if neg return with -1 or hut retur*/
	  
	 char[] c = s.toCharArray();
	 boolean isNeg =  false;
	 int res = 0;
	 int n = c.length;
	 int pos =0;
	 
	 if(c[0] == '-'){
	    isNeg =  true;
	    pos++;
	 }
	 
	 
	 for (int i = pos ;  i< n; i++){
	     if (c[i] >= '0' && c[i] <='9'){
	         res = (res*10) +  c[i] - '0' ;
	     }
	     else{
	         return -1;
	     }
	 }
	 
