package backTracking.medio;

public class Exist {

    /*
     *  [79]
     *  Given an m x n grid of characters board and a string word, return true if word exists in the grid.
        The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
        
        Example 1:
            Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
            Output: true
        
        Example 2:
            Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
            Output: true
        
        Example 3:
            Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
            Output: false
        
        Constraints:
            m == board.length
            n = board[i].length
            1 <= m, n <= 6
            1 <= word.length <= 15
            board and word consists of only lowercase and uppercase English letters.

        Follow up: Could you use search pruning to make your solution faster with a larger board?
     */
    private int[][] neighbores = {
        {1,0},
        {-1,0},
        {0,1},
        {0,-1}
    };

    public boolean exist(char[][] board, String word) {
        if (!earlyPruning(board, word)) return false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (this.dfsExist(board, word, 0, i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean earlyPruning(char[][] board, String word) {
        int[] wordFrec = new int[128];
        int[] boardFrec = new int[128];

        for (char[] row : board) {
            for (char c : row) {
                boardFrec[c]++;
            }
        }

        for (int i = 0; i < word.length(); i++) {
            int ascii = word.charAt(i);
            wordFrec[ascii]++;
            if (wordFrec[ascii] > boardFrec[ascii]) return false;
        }

        return true;
    }


    private boolean dfsExist(char[][] board, String word, int wordIdx, int x, int y) {
        if (wordIdx == word.length()) return true;
        if (x >= board.length || x < 0 || y >= board[0].length || y < 0) return false;
        if (word.charAt(wordIdx) != board[x][y]) return false;

        char charAux = board[x][y];
        board[x][y] = '#'; 

        boolean ans = false;
        for (int[] dir : neighbores) {
            if (this.dfsExist(board, word, wordIdx+1, x+dir[0], y+dir[1])) {
                ans = true;
                break;
            }
        }

        board[x][y] = charAux;

        return ans;
    }
}
