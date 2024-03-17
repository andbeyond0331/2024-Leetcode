class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        boolean flag = true;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                flag = false;
                int count = 0;
                int max = 0;
                nums[i] = 1;
                for(int j = 0; j < nums.length; j++) {
                    if(nums[j]==1) {
                        count++;
                    }else {
                        count = 0;
                    }
                    max = Math.max(count, max);
                }
                nums[i] = 0;
                answer = Math.max(max, answer);
            }
        }
        if(flag) {
            int count = 0;
           for(int i = 0; i < nums.length; i++) {
               if(nums[i] == 1) {
                   count++;
               }else {
                   count = 0;
               }
               answer = Math.max(count, answer);
           } 
        }
        return answer;
    }
}