class Solution {
    public int[] twoSum(int[] nums, int target) {
        int one = 0;
        int two = 0;
        outer:for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i!=j) {
                    if(nums[i] + nums[j] == target) {
                        one = i;
                        two = j;
                        break outer;
                    }
                }
            }
        }
        int[] answer = new int[2];
        answer[0] = one;
        answer[1] = two;
        return answer;
    }
}