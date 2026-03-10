package strings.medio;

public class Convert {

    /**
     * # 6. Zigzag Conversion
     * <p>
     * #### Solved:
     * https://leetcode.com/problems/zigzag-conversion/solutions/7639109/6-zigzag-conversion-by-vairoxcs-9675
     * <p>
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
     * of rows like this: (you may want to display this pattern in a fixed font for
     * better legibility)
     * <p>
     * 
     * P A H N
     * <p>
     * A P L S I I G
     * <p>
     * Y I R
     * <p>
     * And then read line by line: "PAHNAPLSIIGYIR"
     * <p>
     * 
     * Write the code that will take a string and make this conversion given a
     * number of rows:
     * <p>
     * 
     * string convert(string s, int numRows);
     * <p>
     * 
     * 
     * ## Example 1:
     * <p>
     * 
     * Input: s = "PAYPALISHIRING", numRows = 3
     * <p>
     * Output: "PAHNAPLSIIGYIR"
     * <p>
     * ## Example 2:
     * <p>
     * 
     * Input: s = "PAYPALISHIRING", numRows = 4
     * <p>
     * Output: "PINALSIGYAHRPI"
     * <p>
     * ### Explanation:
     * <p>
     * P I N
     * <p>
     * A L S I G
     * <p>
     * Y A H R
     * <p>
     * P I
     * <p>
     * ## Example 3:
     * <p>
     * 
     * Input: s = "A", numRows = 1
     * <p>
     * Output: "A"
     * <p>
     * 
     * 
     * ## Constraints:
     * <p>
     * 
     * 1 <= s.length <= 1000
     * <p>
     * s consists of English letters (lower-case and upper-case), ',' and '.'.
     * <p>
     * 1 <= numRows <= 1000
     * <p>
     * 
     * @param s       String
     * @param numRows number of rows
     * @return
     */
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length())
            return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int row = 0;
        boolean order = false;

        for (char c : s.toCharArray()) {
            rows[row].append(c);

            if (row == 0 || row == numRows - 1) {
                order = !order;
            }

            row += order ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder(s.length());
        for (StringBuilder r : rows) {
            ans.append(r);
        }

        return ans.toString();
    }
}
