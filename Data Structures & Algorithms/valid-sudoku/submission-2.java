class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer> rows = new HashSet<Integer>();
        HashSet<Integer> columns = new HashSet<Integer>();
        HashSet<Integer> subBoxes = new HashSet<Integer>();
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] != '.'){
                    int digit = board[i][j] - '0';
                    
                    int rowKey = i * 10 + digit;
                    int columnKey = j * 10 + digit;
                    int subBoxNumber = (i / 3) * 3 + (j / 3);
                    int subBoxKey = subBoxNumber * 10 + digit;
                    
                    if(rows.contains(rowKey) || columns.contains(columnKey) || subBoxes.contains(subBoxKey)){
                        return false;
                    }
                    else{
                        rows.add(rowKey);
                        columns.add(columnKey);
                        subBoxes.add(subBoxKey);
                    }
                }
            }
        }
        return true;
    }
}