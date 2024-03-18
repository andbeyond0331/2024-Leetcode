class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int max = nums[nums.length-1];
        int answer = 0;
        for(int i = nums.length-2; i >= 0; i--) {
            if(nums[i]<max) {
                max = nums[i];
                count++;
            }
            if(count == 2) {
                answer = nums[i];
                break;
            }
        }
        if(count!=2) {
            answer = nums[nums.length-1];
        }
        return answer;
    }
}