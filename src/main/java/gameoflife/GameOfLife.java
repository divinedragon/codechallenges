package gameoflife;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GameOfLife {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
                new InputStreamReader(ClassLoader.getSystemResourceAsStream("gameoflife.txt")));

        int totalPatterns = Integer.parseInt(input.readLine());

        RuleEngine ruleEngine = new RuleEngine();

        List<Grid> grids = new ArrayList<Grid>(totalPatterns);

        for (int i = 0; i < totalPatterns; i++) {
            String gridSizeLine = input.readLine();
            int gridRows = Integer.parseInt(gridSizeLine.split(" ")[0]);
            int gridCols = Integer.parseInt(gridSizeLine.split(" ")[1]);

            Grid grid = new Grid(gridRows, gridCols, ruleEngine);

            for (int row = 0; row < gridRows; row++) {
                String[] rowStates = input.readLine().split(" ");
                for (int col = 0; col < gridCols; col++) {
                    grid.setState(row, col, "X".contentEquals(rowStates[col]));
                }
            }

            grids.add(grid);
        }

        for (Grid grid : grids) {
            System.out.println("Initial Generation");
            grid.print();
            System.out.println("Next Generation");
            grid.nextGeneration().print();
            System.out.println("---------------------------------------------------");
        }
    }
}
