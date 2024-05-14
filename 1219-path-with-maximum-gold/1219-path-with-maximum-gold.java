class Solution {
    static int max;
    static int[][] ground;
    static boolean[][] visited;
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, 1, -1};
    
    public int getMaximumGold(int[][] grid) {
        int rLen = grid.length;
        int cLen = grid[0].length;
        max = 0;
        ground = grid;  // grid를 직접 참조하도록 수정
        visited = new boolean[rLen][cLen];
        
        for(int i = 0; i < rLen; i++) {
            for(int j = 0; j < cLen; j++) {
                if(grid[i][j] != 0) {
                    visited[i][j] = true;
                    go(i, j, 0);
                    visited[i][j] = false;
                }
            }
        }
        return max;
    }
    
    static void go(int r, int c, int sum) {
        sum += ground[r][c];
        max = Math.max(max, sum);
        
        for(int i = 0; i < dr.length; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            
            if(check(nr, nc)) {
                visited[nr][nc] = true;
                go(nr, nc, sum);
                visited[nr][nc] = false;
            }
        }
    }
    
    static boolean check(int r, int c) {
        return r >= 0 && c >= 0 && r < ground.length && c < ground[0].length && ground[r][c] != 0 && !visited[r][c];
    }
}