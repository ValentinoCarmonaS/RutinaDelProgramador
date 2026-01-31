package array.facil;

public class LargestTriangleArea {

    /**
     * 812. Largest Triangle Area
     * Solved
     * 
     * Given an array of points on the X-Y plane points where points[i] = [xi, yi],
     * return the area of the largest triangle that can be formed by any three
     * different points. Answers within 10-5 of the actual answer will be accepted.
     * 
     * 
     * 
     * Example 1:
     * 
     * 
     * Input: points = [[0,0],[0,1],[1,0],[0,2],[2,0]]
     * Output: 2.00000
     * Explanation: The five points are shown in the above figure. The red triangle
     * is the largest.
     * Example 2:
     * 
     * Input: points = [[1,0],[0,0],[0,1]]
     * Output: 0.50000
     * 
     * 
     * Constraints:
     * 
     * 3 <= points.length <= 50
     * -50 <= xi, yi <= 50
     * All the given points are unique.
     * 
     * @param points
     * @return
     */
    public double largestTriangleArea(int[][] points) {
        double largestArea = 0.0;

        if (points == null || points.length < 3) {
            return largestArea;
        }

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double currentArea = triangleArea(points[i], points[j], points[k]);

                    largestArea = Math.max(largestArea, currentArea);
                }
            }
        }

        return largestArea;
    }

    public double triangleArea(int[] p1, int[] p2, int[] p3) {
        return Math.abs(
                p1[0] * (p2[1] - p3[1]) +
                        p2[0] * (p3[1] - p1[1]) +
                        p3[0] * (p1[1] - p2[1]))
                * 0.5;
    }
}