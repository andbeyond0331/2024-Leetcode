class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] answer = new int[nums.length];
        int idx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2==0) {
                answer[idx++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2==1) {
                answer[idx++] = nums[i];
            }
        }
        return answer;
    }
}