class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i< board.length; i++) {
            int[] row = new int[10];
            int[] column = new int[10];
            for(int j = 0; j < board.length; j++) {
                int rowTemp = Character.getNumericValue(board[i][j]);
                int columnTemp = Character.getNumericValue(board[j][i]);
                if(board[i][j]!='.') {
                    row[rowTemp]++;
                    if(row[rowTemp]>1) {
                        return false;
                    }
                }
                if(board[j][i]!='.') {
                    column[columnTemp]++;
                    if(column[columnTemp]>1) {
                        return false;
                    }
                }
            }
        }
        int[] count;
        for(int n = 0; n < 3; n++) {
            for(int m = 0; m < 3; m++) {
                count = new int[10];
                for(int i = n*3; i < (n*3) + 3; i++) {
                    for(int j = m*3; j < m*3 +3; j++) {
                        int temp = Character.getNumericValue(board[i][j]);
                        if(board[i][j]!='.'){
                            count[temp]++;
                            if(count[temp]>1) {
                                return false;
                            }
                        }
                        
                    }
                }
            }
        }
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 3; j++) {
        //         int temp = Character.getNumericValue(board[i][j]);
        //         count[temp]++;
        //         if(count[temp]>1) {
        //             return fasle;
        //         }
        //     }
        // }
        // count = new int[10];
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 3; j < 6; j++) {
        //         int temp = Character.getNumericValue(board[i][j]);
        //         count[temp]++;
        //         if(count[temp]>1) {
        //             return fasle;
        //         }
        //     }
        // }
        // count = new int[10]; 
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 6; j < 9; j++) {
        //         int temp = Character.getNumericValue(board[i][j]);
        //         count[temp]++;
        //         if(count[temp]>1) {
        //             return fasle;
        //         }
        //     }
        // }
        // count = new int[10]; 
        return true;
    }
}