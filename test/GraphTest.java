package test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import graph.medio.MaxAreaOfIsland;

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
}
