package backTracking.medio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    /*
     *  [17]
     *  Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
        A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

        Example 1:
            Input: digits = "23"
            Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

        Example 2:
            Input: digits = ""
            Output: []

        Example 3:
            Input: digits = "2"
            Output: ["a","b","c"]
        
        Constraints:
            0 <= digits.length <= 4
            digits[i] is a digit in the range ['2', '9'].
     */
    private final Map<Character, String> map = Map.of(
        '2', "abc", 
        '3', "def",
        '4', "ghi",
        '5', "jkl",
        '6', "mno",
        '7', "pqrs",
        '8', "tuv",
        '9', "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder currentCombination, String digits, int index) {
        // Caso base: si el índice llega al final de la cadena de dígitos
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }

        // Obtener el dígito actual y sus letras correspondientes
        char digit = digits.charAt(index);
        String letters = map.get(digit);
        
        // Iterar sobre las letras y continuar el backtracking
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter); // Elegir
            backtrack(combinations, currentCombination, digits, index + 1); // Explorar
            currentCombination.deleteCharAt(currentCombination.length() - 1); // Deshacer (backtrack)
        }
    }
}
