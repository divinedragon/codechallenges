package com.divinedragon.kidas.codechallenges.gameoflife;

import org.springframework.util.Assert;

public class Grid {

    private int rows;

    private int cols;

    private char[][] pattern;

    private RuleEngine ruleEngine;

    public Grid(final int rows, final int cols, final RuleEngine ruleEngine) {

        Assert.isTrue(rows > 0, "Rows of Grid cannot be zero");
        Assert.isTrue(cols > 0, "Columns of Grid cannot be zero");
        Assert.notNull(ruleEngine, "RuleEngine object cannot be null");

        this.rows = cols;
        this.cols = rows;
        this.ruleEngine = ruleEngine;
        this.pattern = new char[rows][cols];
    }

    public void setState(final int x, final int y, final boolean isAlive) {

        checkXY(x, y);

        pattern[x][y] = (isAlive) ? 'x' : '-';
    }

    public boolean getState(final int x, final int y) {

        checkXY(x, y);

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

    public int getAliveNeighbourCount(final int x, final int y) {

        checkXY(x, y);

        int startRow = (x != 0) ? (x - 1) : 0;
        int endRow = (x != (rows - 1)) ? (x + 1) : x;

        int aliveNeighbourCount = 0;

        for ( ; startRow <= endRow; startRow++) {

            int startCol = (y != 0) ? (y - 1) : 0;
            int endCol = (y != (cols - 1)) ? (y + 1) : y;

            for ( ; startCol <= endCol; startCol++) {
                if ((startRow != x || startCol != y)
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

    public boolean getNextGenerationState(final int x, final int y) {

        checkXY(x, y);

        int aliveNeighbourCount = getAliveNeighbourCount(x, y);
        boolean isAliveInCurrentGeneration = (pattern[x][y] == 'x');

        return ruleEngine.isAliveInNextGeneration(
                isAliveInCurrentGeneration, aliveNeighbourCount);
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public RuleEngine getRuleEngine() {
        return ruleEngine;
    }

    private void checkXY(final int x, final int y) {
        Assert.isTrue((x >= 0 && x < rows), "Row number is out of grid specification");
        Assert.isTrue((y >= 0 && y < cols), "Column number is out of grid specification");
    }
}
