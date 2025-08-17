package graph.medio;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class PacificAtlantic {

    /*
     * There is an m x n rectangular island that borders both the Pacific Ocean and
     * Atlantic Ocean. The Pacific Ocean touches the island's left and top edges,
     * and the Atlantic Ocean touches the island's right and bottom edges.
     * The island is partitioned into a grid of square cells. You are given an m x n
     * integer matrix heights where heights[r][c] represents the height above sea
     * level of the cell at coordinate (r, c).
     * The island receives a lot of rain, and the rain water can flow to neighboring
     * cells directly north, south, east, and west if the neighboring cell's height
     * is less than or equal to the current cell's height. Water can flow from any
     * cell adjacent to an ocean into the ocean.
     * Return a 2D list of grid coordinates result where result[i] = [ri, ci]
     * denotes that rain water can flow from cell (ri, ci) to both the Pacific and
     * Atlantic oceans.
     * 
     * Example 1:
     * Input: heights =
     * [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
     * Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
     * Explanation: The following cells can flow to the Pacific and Atlantic oceans,
     * as shown below:
     * [0,4]: [0,4] -> Pacific Ocean
     * [0,4] -> Atlantic Ocean
     * [1,3]: [1,3] -> [0,3] -> Pacific Ocean
     * [1,3] -> [1,4] -> Atlantic Ocean
     * [1,4]: [1,4] -> [1,3] -> [0,3] -> Pacific Ocean
     * [1,4] -> Atlantic Ocean
     * [2,2]: [2,2] -> [1,2] -> [0,2] -> Pacific Ocean
     * [2,2] -> [2,3] -> [2,4] -> Atlantic Ocean
     * [3,0]: [3,0] -> Pacific Ocean
     * [3,0] -> [4,0] -> Atlantic Ocean
     * [3,1]: [3,1] -> [3,0] -> Pacific Ocean
     * [3,1] -> [4,1] -> Atlantic Ocean
     * [4,0]: [4,0] -> Pacific Ocean
     * [4,0] -> Atlantic Ocean
     * Note that there are other possible paths for these cells to flow to the
     * Pacific and Atlantic oceans.
     * 
     * Example 2:
     * Input: heights = [[1]]
     * Output: [[0,0]]
     * Explanation: The water can flow from the only cell to the Pacific and
     * Atlantic oceans.
     * 
     * Constraints:
     * m == heights.length
     * n == heights[r].length
     * 1 <= m, n <= 200
     * 0 <= heights[r][c] <= 105
     */
    int[][] neighbores = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] pacificReachable = new boolean[m][n];
        boolean[][] atlanticReachable = new boolean[m][n];

        Deque<int[]> pacificDeque = new ArrayDeque<>();
        Deque<int[]> atlanticDeque = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            // Pacific:
            pacificDeque.addLast(new int[] { i, 0 });
            // Atlantic:
            atlanticDeque.addLast(new int[] { i, n - 1 });
        }
        for (int j = 0; j < n; j++) {
            // Pacific:
            pacificDeque.addLast(new int[] { 0, j });
            // Atlantic:
            atlanticDeque.addLast(new int[] { m - 1, j });
        }

        this.bfs(heights, pacificReachable, pacificDeque);
        this.bfs(heights, atlanticReachable, atlanticDeque);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void bfs(int[][] heights, boolean[][] reachable, Deque<int[]> q) {
        int m = heights.length;
        int n = heights[0].length;

        while (!q.isEmpty()) {
            int[] cell = q.removeFirst();
            reachable[cell[0]][cell[1]] = true;

            for (int[] neighbore : neighbores) {
                int x = cell[0] + neighbore[0];
                int y = cell[1] + neighbore[1];

                if (x < 0 || y < 0 || x == m || y == n)
                    continue;
                if (reachable[x][y])
                    continue;

                if (heights[cell[0]][cell[1]] <= heights[x][y]) {
                    q.addLast(new int[] { x, y });
                }
            }
        }
    }
}
