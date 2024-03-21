class Solution {
    public int pivotIndex(int[] nums) {
        int[] in = new int[nums.length];
        in[0] = nums[0];
        int[] de = new int[nums.length];
        de[nums.length-1] = nums[nums.length-1];
        for(int i = 1; i < nums.length; i++) {
            in[i] = in[i-1] + nums[i];
            de[nums.length-1-i] = de[nums.length-1-i+1] + nums[nums.length-1-i];
        }
        int answer = -1;
        for(int i = 0; i < nums.length; i++) {
            if(in[i] == de[i]) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}