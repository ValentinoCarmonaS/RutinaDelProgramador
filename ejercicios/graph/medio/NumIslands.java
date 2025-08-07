package graph.medio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NumIslands {
    
    /*
     *  Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
        An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

        Example 1:
            Input: grid = [
            ["1","1","1","1","0"],
            ["1","1","0","1","0"],
            ["1","1","0","0","0"],
            ["0","0","0","0","0"]
            ]
            Output: 1

        Example 2:
            Input: grid = [
            ["1","1","0","0","0"],
            ["1","1","0","0","0"],
            ["0","0","1","0","0"],
            ["0","0","0","1","1"]
            ]
            Output: 3

        Constraints:
            m == grid.length
            n == grid[i].length
            1 <= m, n <= 300
            grid[i][j] is '0' or '1'.
     */
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int numIslands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (visited[i][j] || grid[i][j] == '0') continue;
                this.bfs(grid, i, j, visited);
                numIslands++;
            }
        }

        return numIslands;
    }

    private void bfs(char[][] grid, int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {i, j});

        while (!q.isEmpty()) {
            int[] act = q.remove();
            List<int[]> adyacent = this.getAdyacent(grid, act);

            for (int[] w : adyacent) {
                if (!visited[w[0]][w[1]]) {
                    visited[w[0]][w[1]] = true;
                    q.add(w);
                }
            }
        }
    }

    private List<int[]> getAdyacent(char[][] grid, int[] act) {
        List<int[]> ans = new ArrayList<>();
        int i = act[0];
        int j = act[1];

        if (i > 0 && grid[i-1][j] != '0') {
            ans.add(new int[] {i-1, j});
        }
        if (i < grid.length - 1 && grid[i+1][j] != '0') {
            ans.add(new int[] {i+1, j});
        }
        if (j > 0 && grid[i][j-1] != '0') {
            ans.add(new int[] {i, j-1});
        }
        if (j < grid[i].length - 1 && grid[i][j+1] != '0') {
            ans.add(new int[] {i, j+1});
        }

        return ans;
    }
}
