class Solution {
    public int rob(int[] nums) {
        // 3차 풀이 2024.04.12
        int len = nums.length;
        if(len == 1) {
            return nums[0];
        }
        int[] maxAmount = new int[len];
        maxAmount[0] = nums[0];
        if(len == 2) {
            return Math.max(nums[0], nums[1]);
        }
        maxAmount[1] = nums[1];
        if(len == 3) {
            return Math.max(nums[1], nums[0]+nums[2]);
        }
        maxAmount[2] = Math.max(nums[1], nums[0] + nums[2]);
        int answer = -1;
        for(int i = 3; i < len; i++) {
            maxAmount[i] = Math.max(maxAmount[i-1], Math.max(maxAmount[i-2], maxAmount[i-3]) + nums[i]);
            answer = Math.max(answer, maxAmount[i]);
        }
        return answer;
    }
}