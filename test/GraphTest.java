package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;

import graph.medio.CanFinish;
import graph.medio.CloneGraph;
import graph.medio.KeysAndRooms;
import graph.medio.MaxAreaOfIsland;
import graph.medio.NumIslands;
import graph.medio.OrangesRotting;
import helpers.Node;
import helpers.TreeNode;

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

    @Test
    public void testCloneGraph() {
        CloneGraph cloner = new CloneGraph();
    
        // Test Case 1: Grafo normal
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node3.neighbors.add(node4);
        node4.neighbors.add(node1);
        node4.neighbors.add(node3);
        
        Node cloned1 = cloner.cloneGraph(node1);
        assertGraphEquals(node1, cloned1);
        
        // Test Case 2: Grafo con un solo nodo sin vecinos
        Node singleNode = new Node(1);
        Node clonedSingle = cloner.cloneGraph(singleNode);
        assertGraphEquals(singleNode, clonedSingle);
        
        // Test Case 3: Grafo vacío
        Node nullNode = null;
        Node clonedNull = cloner.cloneGraph(nullNode);
        assertNull(clonedNull);
    }
    
    private boolean assertGraphEquals(Node original, Node clone) {
        if (original == null && clone == null) return true;
        if (original == null || clone == null) return false;
        
        Map<Node, Node> visited = new HashMap<>();
        Stack<Node[]> stack = new Stack<>();
        stack.push(new Node[]{original, clone});
        
        while (!stack.isEmpty()) {
            Node[] pair = stack.pop();
            Node orig = pair[0];
            Node clon = pair[1];
            
            // Comprobaciones básicas
            if (orig.val != clon.val) return false;
            if (orig.neighbors.size() != clon.neighbors.size()) return false;
            
            // Comprobamos si ya hemos mapeado este nodo
            if (visited.containsKey(orig)) {
                if (visited.get(orig) != clon) return false;
                continue;
            }
            
            visited.put(orig, clon);
            
            // Preparamos los vecinos para comparación
            for (int i = 0; i < orig.neighbors.size(); i++) {
                stack.push(new Node[]{orig.neighbors.get(i), clon.neighbors.get(i)});
            }
        }
        
        return true;
    }

    @Test
    public void testCanFinish() {
        CanFinish cf = new CanFinish();

        assertEquals(true, cf.canFinish(2, new int[][] {{1,0}}));
        assertEquals(false, cf.canFinish(2, new int[][] {{1,0}, {0,1}}));
    }
}

