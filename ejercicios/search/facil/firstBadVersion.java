package search.facil;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/*
 * public class Solution extends VersionControl {
 * 
 * 278. First Bad Version
 * Solved
 * You are a product manager and currently leading a team to develop a new
 * product. Unfortunately, the latest version of your product fails the quality
 * check. Since each version is developed based on the previous version, all the
 * versions after a bad version are also bad.
 * 
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first
 * bad one, which causes all the following ones to be bad.
 * 
 * You are given an API bool isBadVersion(version) which returns whether version
 * is bad. Implement a function to find the first bad version. You should
 * minimize the number of calls to the API.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 * 
 * Input: n = 1, bad = 1
 * Output: 1
 * 
 * 
 * Constraints:
 * 
 * 1 <= bad <= n <= 231 - 1
 * 
 * IMPORTANTE:
 * Debido a que la clase extiende de otra clase 'desconocida' y que la funcion
 * utiliza un metodo de esta clase, me vi forzado a comentar toda la resolucion
 * y por ende a no escribir su Test.
 * Aun asi dejo constancia de la resolucion en un post de LeetCode.
 * Link al post:
 * https://leetcode.com/problems/first-bad-version/solutions/7546930/278-first-bad-version-by-vairoxcs-iwlg
 * 
 * public int firstBadVersion(int n) {
 * int version1 = 1;
 * int version2 = n;
 * 
 * while (version2 > version1) {
 * int middleVersion = version1 + ((version2 - version1) / 2);
 * boolean isBadVersion = isBadVersion(middleVersion);
 * 
 * if (isBadVersion) {
 * version2 = middleVersion;
 * 
 * } else {
 * version1 = middleVersion + 1;
 * }
 * }
 * 
 * return version1;
 * }
 * }
 */