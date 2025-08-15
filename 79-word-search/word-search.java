class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(word.charAt(0)==board[i][j]){
                    if(dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char board[][],String word, int i,int j, int idx){
        if(word.length()==idx){
            return true;
        }
        int n=board.length;
        int m=board[0].length;
        if(i<0 || i>=n || j<0 || j>=m || word.charAt(idx)!=board[i][j]){
            return false;
        } 
        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, i + 1, j, idx + 1) ||
                        dfs(board, word, i - 1, j, idx + 1) ||
                        dfs(board, word, i, j + 1, idx + 1) ||
                        dfs(board, word, i, j - 1, idx + 1);

        board[i][j] = temp;
        return found;
    }
}