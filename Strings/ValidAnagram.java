/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        char ch[] = s.toCharArray();
        char ch1[] = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        String x = Arrays.toString(ch);
        String z = Arrays.toString(ch1);
        if(x.equals(z))
        {
            return true;
        }
        return false;
    }
}
