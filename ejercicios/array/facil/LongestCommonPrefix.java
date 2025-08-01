package array.facil;

public class LongestCommonPrefix {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".
        
        Example 1:

        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:

        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.

        Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters if it is non-empty.

        Resultado:
            Tiempo: O(n * m) 
                donde:
                    n = número de strings
                    m = longitud del prefijo más largo

            Espacio: O(1) (solo usa variables temporales)
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }

        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(res)) {
                res = this.decrPrefix(res, strs[i]);
            } 
        }

        return res;
    }

    private String decrPrefix(String res, String s) {
        while (!s.startsWith(res)) {
            res = res.substring(0, res.length() - 1);
        }
        return res;
    }
}
