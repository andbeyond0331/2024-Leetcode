class Solution {
    public int deleteAndEarn(int[] nums) {
        int answer = -1;
        int[] count = new int[10001];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int[] max = new int[10001];
        max[1] = count[1]*1;
        max[2] = Math.max(count[2]*2, max[1]);
        for(int i = 3; i < max.length; i++) {
            max[i] = Math.max(max[i-1], max[i-2] + count[i]*i);
            answer = Math.max(max[i], answer);
        }
        return answer;
    }
}