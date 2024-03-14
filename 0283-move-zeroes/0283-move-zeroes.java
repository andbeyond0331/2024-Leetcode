class Solution {
    public void moveZeroes(int[] nums) {
        // int reader = 0;
        int writer = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[writer++] = nums[i];
            }
        }
        while(writer < nums.length) {
            nums[writer++] = 0;
        }
        
        // 0이 아닌 걸 보면 writer한테 0이 있었던 자리에 넣으랴고 함
    }
}