package com.divinedragon.kidas.codechallenges.gameoflife;

public class Grid {

    private int rows;

    private int cols;

    private char[][] pattern;

    private RuleEngine ruleEngine;

    public Grid(final int rows, final int cols, final RuleEngine ruleEngine) {
        this.rows = cols;
        this.cols = rows;
        this.ruleEngine = ruleEngine;
        this.pattern = new char[rows][cols];
    }

    public void setState(final int x, final int y, final boolean isAlive) {
        pattern[x][y] = (isAlive) ? 'x' : '-';
    }

    public boolean getState(final int x, final int y) {
        return (pattern[x][y] == 'x');
    }

    public void print() {

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(pattern[row][col] + " ");
            }
            System.out.println();
        }
    }

    public int getAliveNeighbourCount(final int row, final int col) {

        int startRow = (row != 0) ? (row - 1) : 0;
        int endRow = (row != (rows - 1)) ? (row + 1) : row;

        int aliveNeighbourCount = 0;

        for ( ; startRow <= endRow; startRow++) {

            int startCol = (col != 0) ? (col - 1) : 0;
            int endCol = (col != (cols - 1)) ? (col + 1) : col;

            for ( ; startCol <= endCol; startCol++) {
                if ((startRow != row || startCol != col)
                        && ('x' == pattern[startRow][startCol])) {
                    aliveNeighbourCount++;
                }
            }
        }

        return aliveNeighbourCount;
    }

    public Grid nextGeneration() {

        Grid newGrid = new Grid(rows, cols, ruleEngine);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                boolean newGenerationState = getNextGenerationState(r, c);
                newGrid.setState(r, c, newGenerationState);
            }
        }
        
        return newGrid;
    }

    private boolean getNextGenerationState(final int row, final int col) {
        
        int aliveNeighbourCount = getAliveNeighbourCount(row, col);
        boolean isAliveInCurrentGeneration = (pattern[row][col] == 'x');

        return ruleEngine.isAliveInNextGeneration(
                isAliveInCurrentGeneration, aliveNeighbourCount);
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
