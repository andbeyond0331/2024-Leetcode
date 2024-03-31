class Solution {
    static int[] dp;
    public int tribonacci(int n) {
        // T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
        dp = new int[n+1];
        dp[0] = 0;
        if(n==0){
            return dp[0];
        }
        dp[1] = 1;
        if(n==1) {
            return dp[1];
        }
        dp[2] = 1;
        if(n==2) {
            return dp[2];
        }
        return memorize(n);
    }
    static int memorize(int goal) {
        if(goal>2 && dp[goal] == 0) {
            dp[goal] = memorize(goal-1) + memorize(goal-2) + memorize(goal-3);
        }
        return dp[goal];
        
    }
}