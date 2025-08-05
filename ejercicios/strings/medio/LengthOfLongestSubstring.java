package strings.medio;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {

    /*
     *  Given a string s, find the length of the longest substring without duplicate characters.
        Example 1:
            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.

        Example 2:
            Input: s = "bbbbb"
            Output: 1
            Explanation: The answer is "b", with the length of 1.

        Example 3:
            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        Constraints:
            0 <= s.length <= 5 * 104
            s consists of English letters, digits, symbols and spaces.
     */
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int wait = 0;
        int max = 0;
        for (int reed = 0; reed < s.length(); reed++) {
            char act = s.charAt(reed);
            map.put(act, map.getOrDefault(act, 0) + 1);

            // Si tenemos mas de un elemento de este caracter...
            while (map.get(act) > 1) {
                int aux = map.get(s.charAt(wait));
                if (aux == 1) map.remove(s.charAt(wait));
                else map.put(s.charAt(wait), --aux);
                wait++;
            }

            max = Math.max(max, reed - wait + 1);
        }
        return max;
    }
}
