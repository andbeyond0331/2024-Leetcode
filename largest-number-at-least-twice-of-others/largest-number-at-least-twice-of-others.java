class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            // max = Math.max(max, nums[i]);
            if(max<nums[i]) {
                max = nums[i];
                index = i;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(i!=index) {
                if(nums[i]*2>max) {
                    index = -1;
                }
            }
        }
        return index;
    }
}