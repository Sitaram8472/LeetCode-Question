public class Q_37 {
  // exist or not
  public static boolean issafe(char[][] board, int row, int col, char digit) {

    // row
    for (int i = 0; i < 9; i++) {
      if (board[i][col] == digit) {
        return false;
      }
    }

    // col
    for (int i = 0; i < 9; i++) {
      if (board[row][i] == digit) {
        return false;
      }
    }


    // grid
    

    int sr = (row / 3) * 3;
    int sc = (col / 3) * 3;

    for (int i = sr; i < sr + 3; i++) {
      for (int j = sc; j < sc + 3; j++) {
        if (board[i][j] == digit) {
          return false;
        }
      }
    }

    return true;
  }

  // recursive way
  public static boolean sudukoway(char[][] board, int row, int col) {
    if (row == 9) {
      return true;
    }

    // next row and next col

    int nextrow = row, nextcol = col + 1;
    if (col + 1 == 9) {
      nextrow = row + 1;
      nextcol = 0;
    }

    if (board[row][col] != '.') {
      return sudukoway(board, nextrow, nextcol);
    }

    for (char digit = '1'; digit <= '9'; digit++) {
      if (issafe(board, row, col, digit)) {
        board[row][col] = digit;
        if (sudukoway(board, nextrow, nextcol)) {
          return true;
        }
        board[row][col] = '.';
      }
    }

    return false;
  }

  public void solveSudoku(char[][] board) {
    sudukoway(board, 0, 0);
  }
}
