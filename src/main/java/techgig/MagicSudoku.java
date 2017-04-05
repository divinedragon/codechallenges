package techgig;

public class MagicSudoku {

    public int solveMagicSquare(final int[][] matrix) {

        boolean isMagicSquare = true;

        int N = matrix.length;

        int[] temp = new int[N + 1];

        for (int row = 0; row < N; row++) {

            for (int col = 0; col <= N; col++) {
                temp[col] = 0;
            }

            for (int col = 0; col < N; col++) {

                int cellValue = matrix[row][col];

                if (cellValue < 0 || cellValue > N || (cellValue != 0 && temp[cellValue] != 0)) {
                    isMagicSquare = false;
                } else {
                    temp[cellValue] = 1;
                }
            }

            if (!isMagicSquare) {
                break;
            }
        }

        return (isMagicSquare) ? 1 : 0;
    }
}
