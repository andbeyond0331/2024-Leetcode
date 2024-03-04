class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = -1;
        for(int i = 0; i < nums.length ; i++) {
            if(i==0) {
                if(nums[0]==1) {
                    count++;
                }
            }else{
                if(nums[i]==1) {
                    count++;
                }else{
                    max = Math.max(count, max);
                    count = 0;
                }
            }
        }
        return Math.max(count, max);
    }
}