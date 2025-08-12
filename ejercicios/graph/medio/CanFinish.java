package graph.medio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CanFinish {

    /*
     *  [207]
     *  There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
        For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
        Return true if you can finish all courses. Otherwise, return false.

        Example 1:
            Input: numCourses = 2, prerequisites = [[1,0]]
            Output: true
            Explanation: There are a total of 2 courses to take. 
            To take course 1 you should have finished course 0. So it is possible.
            
        Example 2:
            Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
            Output: false
            Explanation: There are a total of 2 courses to take. 
            To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.

        Constraints:
            1 <= numCourses <= 2000
            0 <= prerequisites.length <= 5000
            prerequisites[i].length == 2
            0 <= ai, bi < numCourses
            All the pairs prerequisites[i] are unique.
     */
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Queue<Integer> q = new LinkedList<>();
        int[] orders = new int[numCourses];
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int ans = 0;

        for (int[] prereq : prerequisites) {
            orders[prereq[0]]++;
            adj.putIfAbsent(prereq[1], new ArrayList<>());
            adj.get(prereq[1]).add(prereq[0]);
        }

        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == 0) q.add(i);
        }
    
        while (!q.isEmpty()) {
            int curse = q.remove();
            ans++;
            List<Integer> adjacent = adj.get(curse);
            if (adjacent != null) {
                for (int i = 0; i < adjacent.size(); i++) {
                    int c = adjacent.get(i);
                    orders[c]--;
                    if (orders[c] == 0) q.add(c);
                }
            }
        }

        return ans == numCourses;
    }
}
