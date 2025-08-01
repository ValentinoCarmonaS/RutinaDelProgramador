package strings.facil;

public class AddBinary {
    
    /*
     *  Given two binary strings a and b, return their sum as a binary string.
        Example 1:
            Input: a = "11", b = "1"
            Output: "100"

        Example 2:
            Input: a = "1010", b = "1011"
            Output: "10101"

        Constraints:
            1 <= a.length, b.length <= 104
            a and b consist only of '0' or '1' characters.
            Each string does not contain leading zeros except for the zero itself.
     */
    public String addBinary(String a, String b) {
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        int carry = 0;
        StringBuffer res = new StringBuffer();

        while (0 <= aIdx || 0 <= bIdx || carry == 1) {
            if (aIdx >= 0) {
                carry += a.charAt(aIdx--) - '0';
            }
            if (bIdx >= 0) {
                carry += b.charAt(bIdx--) - '0';
            }
            res.append(String.valueOf(carry % 2));
            carry /= 2;
        }

        return res.reverse().toString();
    }
}
