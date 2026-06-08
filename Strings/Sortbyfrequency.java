/*
Given a string s, sort it in decreasing order based on the frequency of the characters. 
The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
*/
class Solution {
    public String frequencySort(String s) {

        Pair[] freq = new Pair[128];

        for (int i = 0; i < 128; i++) {
            freq[i] = new Pair(0, (char) i);
        }

        for (char ch : s.toCharArray()) {
            freq[ch].freq++;
        }

        Arrays.sort(freq, (p1, p2) -> {
            if (p1.freq != p2.freq)
                return p2.freq - p1.freq;
            return p2.ch - p1.ch; // optional tie-breaker
        });

        StringBuilder ans = new StringBuilder();

        for (Pair p : freq) {
            for (int i = 0; i < p.freq; i++) {
                ans.append(p.ch);
            }
        }

        return ans.toString();
    }
}

class Pair {
    int freq;
    char ch;

    Pair(int freq, char ch) {
        this.freq = freq;
        this.ch = ch;
    }
}
