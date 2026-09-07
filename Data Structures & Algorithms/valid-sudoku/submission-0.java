class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row[] = new int[9];
        int column[] = new int[9];
        int sqaure[] = new int[9];
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.') continue;
                int val = board[r][c]-'1';
               if((row[r]&(1<<val)) > 0 || (column[c] & (1<<val)) > 0 || (sqaure[(r/3)*3 +(c/3)]&(1<<val)) > 0){
                return false;
               }
               row[r] |= (1<<val);
               column[c] |= (1<<val);
               sqaure[(r/3)*3 + (c/3)] |= (1<<val);
            }
        }
        return true;
    }
}
