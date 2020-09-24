import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveNQueens {
    //1、不在同一行；2、不在同一列；3、不在同一主对角线方向上；4、不在同一对角线方向上。
    public List<List<String>> solve(int n) {
        List<List<String>> res = new ArrayList<>();
        char board[][] = new char[n][n];
        init(board);//全部填入"."
        helper(res, board, 0);
        return res;
    }

    public void helper(List<List<String>> res, char board[][], int rowIndex) {
        if (rowIndex == board.length) {
            res.add(generate(board));
            return;
        }//终止条件

        for (int colIndex = 0; colIndex < board.length; colIndex++) {
            if (isValid(board, rowIndex, colIndex)) {//判断是否符合条件
                board[rowIndex][colIndex] = 'Q';
                helper(res, board, rowIndex + 1);
                board[rowIndex][colIndex] = '.';//回溯
            }
        }
    }

    public boolean isValid(char board[][], int rowIndex, int colIndex) {
        for (int i = 0; i < rowIndex; i++) {
            if (board[i][colIndex] == 'Q') {
                return false;
            }
        }
        for (int i = rowIndex - 1, j = colIndex - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = rowIndex - 1, j = colIndex + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    public void init(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }
    }

    public List<String> generate(char board[][]) {
        List<String> List = new ArrayList<>();
        for (char[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (char c : row) {
                sb.append(c);
            }
            List.add(sb.toString());
        }
        return List;
    }

    public static void main(String[] args) {
        SolveNQueens test = new SolveNQueens();
        System.out.println(test.solve(4));
    }
}
