package math.facil;

public class TheMaximumAchievableX {
    // Constantes
    private static final int MAX_CONSTRAINT = 50;
    private static final int MIN_CONSTRAINT = 1;

    /**
     * Calcula el máximo valor de x.
     * En cada operación, podemos reducir la distancia
     * entre x y num en 2 unidades (x-1 y num+1).
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
