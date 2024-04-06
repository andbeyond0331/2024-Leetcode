class Solution {
    private static int n;
    private static int m;
    private static int[] multipliers;
    private static int[] nums;
    private static int[][] memo;
    public int maximumScore(int[] nums, int[] multipliers) {
        this.n = nums.length;
        this.m = multipliers.length;
        this.nums = nums;
        this.multipliers = multipliers;
        this.memo = new int[m][m];
        return dp(0, 0);
    }
    
    private int dp(int i, int left) {
        if(i == m) {
            return 0;
        }
        int mul = multipliers[i];
        int right = n - 1 - (i - left);
        if(memo[i][left] == 0) {
            memo[i][left] = Math.max(mul * nums[left] + dp(i + 1, left + 1), mul * nums[right] + dp(i + 1, left));
        }
        return memo[i][left];
    }
    
}