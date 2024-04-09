class Solution {
    public int removeElement(int[] nums, int val) {
        int[] answer = new int[nums.length];
        int index = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                answer[index] = nums[i];
                index++;
                count++;
            }
            // else{
            //     count++;
            // }
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = answer[i];
        }
        return count;
    }
}