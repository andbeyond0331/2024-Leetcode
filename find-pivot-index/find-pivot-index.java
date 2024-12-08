class Solution {
    public int pivotIndex(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i-1];
        }
    
        for (int i = 0;i < nums.length; i++) {
            if (i==0) {
                if(sums[nums.length-1] - nums[0] == 0) {
                    return 0;
                }
            } else if (i<=nums.length-1) {
                if (sums[i-1] == sums[nums.length-1] - sums[i]) {
                    return i;
                }
            } else {
                if (sums[nums.length-1] == 0) {
                    return 0;
                }
            }
        }
        return -1;
    }
}