class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> checker = new HashSet<String>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    String rowKey = "r" + i + board[i][j];
                    String columnKey = "c" + j + board[i][j];
                    Integer subBoxNumber = (3*(i/3)) + (j/3);
                    String subBoxKey = "sb" + subBoxNumber + board[i][j];
                    if(checker.contains(rowKey) || checker.contains(columnKey) || checker.contains(subBoxKey)){
                        return false;
                    }
                    else{
                        checker.add(rowKey);
                        checker.add(columnKey);
                        checker.add(subBoxKey);
                    }
                }
            }
        }
        return true;
    }
}
