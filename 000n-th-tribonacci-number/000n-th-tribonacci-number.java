// 2차 풀이 240403 top-down

class Solution {
    static int[] dp;
    static boolean[] visited;
    public int tribonacci(int n) {
        dp = new int[n+1];
        visited = new boolean[n+1];
        if (n == 0) {
            return 0;
        }
        dp[0] = 0;
        visited[0] = true;
        if (n == 1) {
            return 1;
        }
        dp[1] = 1;
        visited[1] = true;
        if (n == 2) {
            return 1;
        }
        dp[2] = 1;
        visited[2] = true;
        return memorize(n);
    }
    static int memorize(int target) {
        if(visited[target]) {
            return dp[target];
        }
        dp[target] = memorize(target-1) + memorize(target-2) + memorize(target-3);
        visited[target] = true;
        return dp[target];
    }
}