class Solution {
    // 혼자 풀어보기 24.04.06
    static int[] nums;
    static int[] multipliers;
    static int n;
    static int m;
    static int[][] memo;
    public int maximumScore(int[] nums, int[] multipliers) {
        this.nums = nums;
        this.multipliers = multipliers;
        n = nums.length;
        m = multipliers.length;
        memo = new int[m][m];
        return dp(0, 0);
    }
    static int dp(int i, int left) {
        if(i == m) {
            return 0;
        }
        int temp = multipliers[i];
        int right = n - 1 - (i - left);
        if(memo[i][left] == 0) {
            memo[i][left] = Math.max(temp * nums[left] + dp(i + 1, left + 1), temp * nums[right] + dp(i + 1, left));
        }
        return memo[i][left];
    }
}