package strings.facil;

public class ValidPalindrome {

    /*  [125]
     *  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
            Input: s = "A man, a plan, a canal: Panama"
            Output: true
            Explanation: "amanaplanacanalpanama" is a palindrome.
        
        Example 2:
            Input: s = "race a car"
            Output: false
            Explanation: "raceacar" is not a palindrome.
            
        Example 3:
            Input: s = " "
            Output: true
            Explanation: s is an empty string "" after removing non-alphanumeric characters.
            Since an empty string reads the same forward and backward, it is a palindrome.

        Constraints:
            1 <= s.length <= 2 * 105
            s consists only of printable ASCII characters.
     */
    public boolean isPalindrome(String s) {
        int leftIdx = 0;
        int rightIdx = s.length()-1;

        while (leftIdx <= rightIdx) {
            Character left = this.reduce(s.charAt(leftIdx));
            if (left == null) {
                leftIdx++;
                continue;
            }
            Character right = this.reduce(s.charAt(rightIdx));
            if (right == null) {
                rightIdx--;
                continue;
            }
            if (left != right) return false;
            leftIdx++;
            rightIdx--;
        }  

        return true;
    }

    private Character reduce(char c) {
        if (!Character.isLetter(c) && !Character.isDigit(c)) return null;
        return Character.toLowerCase(c);
    }
}
