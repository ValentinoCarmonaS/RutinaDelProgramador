package math.facil;

public class TheMaximumAchievableX {
    // Constantes
    private static final int MAX_CONSTRAINT = 50;
    private static final int MIN_CONSTRAINT = 1;

    /**
     * 2769. Find the Maximum Achievable Number
     * Solved
     * Given two integers, num and t. A number x is achievable if it can become
     * equal to num after applying the following operation at most t times:
     * 
     * Increase or decrease x by 1, and simultaneously increase or decrease num by
     * 1.
     * Return the maximum possible value of x.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: num = 4, t = 1
     * 
     * Output: 6
     * 
     * Explanation:
     * 
     * Apply the following operation once to make the maximum achievable number
     * equal to num:
     * 
     * Decrease the maximum achievable number by 1, and increase num by 1.
     * Example 2:
     * 
     * Input: num = 3, t = 2
     * 
     * Output: 7
     * 
     * Explanation:
     * 
     * Apply the following operation twice to make the maximum achievable number
     * equal to num:
     * 
     * Decrease the maximum achievable number by 1, and increase num by 1.
     * 
     * 
     * Constraints:
     * 
     * 1 <= num, t <= 50
     * 
     * @param num Valor base
     * @param t   Cantidad máxima de operaciones
     * @return El máximo valor alcanzable
     * @throws IllegalArgumentException si los parámetros violan las restricciones
     *                                  del dominio
     */
    public static int theMaximumAchievableX(final int num, final int t) {
        validateInput(num, t);

        return num + (2 * t);
    }

    private static void validateInput(int num, int t) {
        if (num < MIN_CONSTRAINT || num > MAX_CONSTRAINT || t < MIN_CONSTRAINT || t > MAX_CONSTRAINT) {
            throw new IllegalArgumentException(
                    "num y t deben estar entre %d y %d"
                            .formatted(MIN_CONSTRAINT, MAX_CONSTRAINT));
        }
    }
}
