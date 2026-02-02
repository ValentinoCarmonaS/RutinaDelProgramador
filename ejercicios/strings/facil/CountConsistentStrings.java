package strings.facil;

public class CountConsistentStrings {

    /**
     * 1684. Count the Number of Consistent Strings
     * Solved
     * You are given a string allowed consisting of distinct characters and an array
     * of strings words. A string is consistent if all characters in the string
     * appear in the string allowed.
     * 
     * Return the number of consistent strings in the array words.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
     * Output: 2
     * Explanation: Strings "aaab" and "baa" are consistent since they only contain
     * characters 'a' and 'b'.
     * Example 2:
     * 
     * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
     * Output: 7
     * Explanation: All strings are consistent.
     * Example 3:
     * 
     * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
     * Output: 4
     * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
     * 
     * 
     * Constraints:
     * 
     * 1 <= words.length <= 104
     * 1 <= allowed.length <= 26
     * 1 <= words[i].length <= 10
     * The characters in allowed are distinct.
     * words[i] and allowed contain only lowercase English letters.
     * 
     * @param allowed
     * @param words
     * @return
     */
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentWords = 0;

        if (allowed == null || words == null) {
            return consistentWords;
        }

        boolean[] isAllowed = new boolean[26];

        for (char c : allowed.toCharArray()) {
            isAllowed[c - 'a'] = true;
        }

        for (String word : words) {
            if (isWordConsistent(word, isAllowed)) {
                consistentWords++;
            }
        }

        return consistentWords;
    }

    private boolean isWordConsistent(String word, boolean[] isAllowed) {
        for (char c : word.toCharArray()) {
            int idx = c - 'a';

            if (idx < 0 || idx >= 26) {
                return false;
            }

            if (!isAllowed[idx]) {
                return false;
            }
        }

        return true;
    }
}
