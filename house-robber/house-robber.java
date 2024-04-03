class Solution {
    public int rob(int[] nums) {
        // 2차 풀이 2024.04.03
        int len = nums.length;
        int[] max = new int[len];
        max[0] = nums[0];
        
        if(len==1) {
            return nums[0];
        }
        max[1] = nums[1];
        if(len==2) {
            return Math.max(nums[0], nums[1]);
        }
        max[2] = Math.max(max[0]+nums[2], max[1]);
        for(int i = 3; i < len; i++) {
            max[i] = Math.max(Math.max(max[i-1], max[i-3] + nums[i]), max[i-2] + nums[i]);
        }
        return Math.max(max[len-1], max[len-2]);
    }
}