class Solution {
    public boolean isValidSudoku(char[][] board) {
        //HashSet implementation
        HashSet<String> set = new HashSet<>();
        for(int r=0; r<board.length;r++){
            for(int c=0;c<board[0].length;c++){
                if(board[r][c]=='.') continue;
                char val = board[r][c];
                String rowKey = val+" found in row "+r;
                String columnKey = val+" found in column "+c;
                String boxKey = val+"found in box "+((r/3)*3)+"-"+(c/3);
                if(!set.add(rowKey) || !set.add(columnKey) || !set.add(boxKey))
                return false;
            }
        }
        return true;
    }
}
