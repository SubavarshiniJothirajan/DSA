/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true
Example 2:

Input: s = "abcde", goal = "abced"
Output: false
 
*/
class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        while(i<s.length())
        {
           
            sb.append(sb.charAt(0));
            sb.deleteCharAt(0);
            if(sb.toString().equals(goal))
                return true;
            i++;

        }
        return false;
    }
}

//return false; // If no match found, return false
