// 2차 풀이 240403 bottom-up

class Solution {
    public int tribonacci(int n) {
        int[] memory = new int[n+1];
        memory[0] = 0;
        if (n == 0) {
            return 0;
        }
        memory[1] = 1;
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        memory[2] = 1;
        for(int i = 3; i <= n; i++) {
            memory[i] = memory[i-1] + memory[i-2] + memory[i-3];
        }
        return memory[n];
    }
}