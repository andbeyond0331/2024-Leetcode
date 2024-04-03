class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // 2차 풀이 24.04.03
        int len = cost.length;
        if (len == 1) {
            return cost[0];
        }
        int[] min = new int[len];
        min[0] = cost[0];
        min[1] = cost[1];
        for(int i = 2; i < len; i++) {
            min[i] = Math.min(min[i-2], min[i-1]) + cost[i];
        }
        return Math.min(min[len-1], min[len-2]);
    }
}