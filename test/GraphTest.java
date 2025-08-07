package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import graph.medio.KeysAndRooms;
import graph.medio.MaxAreaOfIsland;
import graph.medio.NumIslands;
import graph.medio.OrangesRotting;

public class GraphTest {
    
    @Test
    public void testMaxAreaOfIsland() {
        MaxAreaOfIsland mai = new MaxAreaOfIsland();
        int[][] grid1 = {
            {0,0,1,0,0,0,0,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,1,1,0,1,0,0,0,0,0,0,0,0},
            {0,1,0,0,1,1,0,0,1,0,1,0,0},
            {0,1,0,0,1,1,0,0,1,1,1,0,0},
            {0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},
            {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        int[][] grid2 = {{0,0,0,0,0,0,0,0}};

        assertEquals(6, mai.maxAreaOfIsland(grid1));
        assertEquals(0, mai.maxAreaOfIsland(grid2));
    }

    @Test
    public void testCanVisitAllRooms() {
        KeysAndRooms kar = new KeysAndRooms();
        
        assertEquals(true, kar.canVisitAllRooms(
                Arrays.asList(
                    Arrays.asList(1),
                    Arrays.asList(2),
                    Arrays.asList(3),
                    Arrays.asList()
                )));
        
        assertEquals(false, kar.canVisitAllRooms(
                Arrays.asList(
                    Arrays.asList(1,3),
                    Arrays.asList(3,0,1),
                    Arrays.asList(2),
                    Arrays.asList(0)
                )));
    }

    @Test
    public void testNumIslands() {
        NumIslands ni = new NumIslands();

        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };

        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        assertEquals(1, ni.numIslands(grid1));
        assertEquals(3, ni.numIslands(grid2));
    }

    @Test
    public void testOrangesRotting() {
        OrangesRotting or = new OrangesRotting();
        int[][] grid1 = {
            {2,1,1},
            {1,1,0},
            {0,1,1}
        };
        int[][] grid2 = {
            {2,1,1},
            {0,1,1},
            {1,0,1}
        };
        int[][] grid3 = {{0,2}};
        int[][] grid4 = {
            {2,1,1},
            {1,1,1},
            {0,1,2}
        };

        assertEquals(4, or.orangesRotting(grid1));
        assertEquals(-1, or.orangesRotting(grid2));
        assertEquals(0, or.orangesRotting(grid3));
        assertEquals(2, or.orangesRotting(grid4));
    }
}
