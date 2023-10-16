public class NKnights {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        Knights(board, 0, 0, 4);
    }
    public static void Display(boolean[][] board)
    {
        for(int i =0;i<board.length;i++)
        {
            for(int j =0;j<board.length;j++)
            {
                if(board[i][j])
                {
                    System.out.print("K ");
                }
                else
                {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void Knights(boolean[][] board, int row, int col , int Knights)
    {
        if(Knights == 0)
        {
            Display(board);
            System.out.println();
        }
        if(row == board.length-1 && col == board.length)
        {
            return;
        }
        if(col == board.length)
        {
            Knights(board,row+1,0,Knights);
            return;
        }

        if(isSafe(board,row,col))
        {
            board[row][col] = true;
            Knights(board,row,col+1,Knights-1);
            board[row][col] = false;
        }
        Knights(board,row,col+1,Knights);
    }
    public static boolean isValid(boolean[][] board, int row, int col)
    {
        if(row>=0 && row<board.length && col>=0 && col<board.length)
        {
            return true;
        }
        return false;
    }
    public static boolean isSafe(boolean[][] board, int row, int col)
    {
        if(isValid(board, row-2, col-1))
        {
            if(board[row-2][col-1])
            {
                return false;
            }
        }
        if(isValid(board, row-2, col+1))
        {
            if(board[row-2][col+1])
            {
                return false;
            }
        }
        if(isValid(board, row-1, col+2))
        {
            if(board[row-1][col+2])
            {
                return false;
            }
        }
        if(isValid(board, row-1, col-2))
        {
            if(board[row-1][col-2])
            {
                return false;
            }
        }
        return true;
    }
}
