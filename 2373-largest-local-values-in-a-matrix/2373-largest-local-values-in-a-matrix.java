class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len = grid.length;
        int[][] maxG = new int[len-2][len-2];
        for(int i = 0; i < len-2; i++) {
            for(int j = 0; j < len-2; j++) {
                int max = 0;
                for(int k = 0; k < 3; k++) {
                    for(int l = 0; l < 3; l++) {
                        max = Math.max(grid[i+k][j+l], max);
                    }
                    maxG[i][j] = max;
                }
            }
       }
        return maxG;
    }
}