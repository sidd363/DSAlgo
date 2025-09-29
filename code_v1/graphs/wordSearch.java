package graphs;

public class wordSearch {

    public static boolean isWordExist(char[][] board, String word)
    {
        // Code here
        boolean pre = false;
        int r = board.length;
        int c = board[0].length;
        boolean[][] vis = new boolean[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                if(board[i][j] == word.charAt(0)){
                    if(util(i, j, 0, board, vis, r, c, word)){
                        return true;
                    }
                }
            }
        }
        return pre;
    }

    private static boolean util(int i, int j, int index, char[][] board, boolean[][] vis, int r, int c, String word) {

        if(index == word.length() ){
            return  true;
        }
        if(i<0 || i>=r || j<0 || j>= c || index > word.length() || vis[i][j] == true || board[i][j] != word.charAt(index)){
            return false;
        }

        vis[i][j] = true;
        boolean left = util(i-1, j, index+1, board, vis, r, c, word);
        boolean right = util(i+1, j, index+1, board, vis, r, c, word);
        boolean top = util(i, j-1, index+1, board, vis, r, c, word);
        boolean bottom = util(i, j+1, index+1, board, vis, r, c, word);

        vis[i][j] = false;
        if(left == true || right== true || top == true || bottom == true  ){
            return  true;
        }
        return false;
    }


    public static void main(String[] args) {
        char [][] grid = {
                {'a', 'g' ,'o' ,'c'},
                {'q','e','e','l'},
                {'g','b','k','s'}
        };

        System.out.println(" is word  present  "+ isWordExist(grid, "geeks"));
    }
}
