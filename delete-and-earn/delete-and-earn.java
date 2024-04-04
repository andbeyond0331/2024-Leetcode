class Solution {
    // 2차 풀이 24.04.04
    public int deleteAndEarn(int[] nums) {
        int[] count = new int[2*(10001)];
        int answer = -1;
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int len = count.length;
        int[] max = new int[len];
        max[1] = count[1]*1;
        max[2] = Math.max(max[1], count[2]*2);
        for(int i = 3;i < len; i++) {
            max[i] = Math.max(max[i-2] + (count[i]*i), max[i-1]);
            answer = Math.max(max[i], answer);
        }
        return answer;
    }
}