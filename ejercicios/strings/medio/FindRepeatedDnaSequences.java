package strings.medio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindRepeatedDnaSequences {

    /*
     *  The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.
        For example, "ACGAATTCCG" is a DNA sequence.
        When studying DNA, it is useful to identify repeated sequences within the DNA.
        Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.
        
        Example 1:
            Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
            Output: ["AAAAACCCCC","CCCCCAAAAA"]
        
        Example 2:
            Input: s = "AAAAAAAAAAAAA"
            Output: ["AAAAAAAAAA"]
        
        Constraints:
            1 <= s.length <= 105
            s[i] is either 'A', 'C', 'G', or 'T'.

     */
    public List<String> findRepeatedDnaSequences(String s) {
        
        if(s.length() < 10 || s.length() > 10000) return new ArrayList<>();

       HashSet<String> seen = new HashSet<>();
       HashSet<String> repeated = new HashSet<>();

        for(int i=0; i<=s.length()-10; i++){
            String str = s.substring(i, i+10);

            if(!seen.add(str)){
                repeated.add(str);
            }
        }

        return new ArrayList<>(repeated);
    }

    /*
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        StringBuilder subStr = new StringBuilder();
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            subStr.append(s.charAt(r));
            while (r - l + 1 > 10) {
                subStr.deleteCharAt(0);
                l++;
            }
            if (r - l + 1 == 10) {
                String dna = subStr.toString();
                int count = map.getOrDefault(dna, 0) + 1;
                map.put(dna, count);
                if (count == 2) ans.add(dna);
            }
        }
        return ans;
    }
}
     */
}
