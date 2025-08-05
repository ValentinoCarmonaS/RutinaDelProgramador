package strings.facil;

public class ConvertToTitle {

    /*
     *  Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
        For example:

        A -> 1
        B -> 2
        C -> 3
        ...
        Z -> 26
        AA -> 27
        AB -> 28 
        ...
        

        Example 1:
            Input: columnNumber = 1
            Output: "A"

        Example 2:
            Input: columnNumber = 28
            Output: "AB"

        Example 3:
            Input: columnNumber = 701
            Output: "ZY"

        Constraints:
            1 <= columnNumber <= 231 - 1
     */
    public String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();
        int num = columnNumber;
        int numberAscii;
        for (int i = 1; num > 0; i++) {

            numberAscii = (num - 1) % 26;

            num = (num - 1) / 26;

            ans = ans.append((char) ('A' + numberAscii)); 
        }
        return ans.reverse().toString();
    }
}
