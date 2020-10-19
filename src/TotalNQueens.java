import java.util.Arrays;

public class TotalNQueens {
    int ans = 0;

    public int total(int n) {
        char[][] board = new char[n][n];
        init(board);
        helper(board, 0);
        return ans;
    }

    public void init(char[][] board) {
        for (char[] chars : board) {
            Arrays.fill(chars, '.');
        }
    }

    public void helper(char[][] board, int rowIndex) {
        if (rowIndex == board.length) {
            ans++;
            return;
        }
        for (int colIndex = 0; colIndex < board.length; colIndex++) {
            if (isValid(board, rowIndex, colIndex)) {
                board[rowIndex][colIndex] = 'Q';
                helper(board, rowIndex + 1);
                board[rowIndex][colIndex] = '.';
            }
        }
    }

    public boolean isValid(char[][] board, int rowIndex, int colIndex) {
        for (int i = 0; i < rowIndex; i++) {
            if (board[i][colIndex] == 'Q') {
                return false;
            }
        }
        for (int i = rowIndex - 1, j = colIndex - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = rowIndex - 1, j = colIndex + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TotalNQueens test = new TotalNQueens();
        System.out.println(test.total(10));
    }

}
