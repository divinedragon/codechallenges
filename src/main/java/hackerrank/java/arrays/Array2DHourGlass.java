package hackerrank.java.arrays;

public class Array2DHourGlass {

    public static int hourglassSum(final int[][] array) {

        int maxHourGlassSum = Integer.MIN_VALUE;

        for (int y = 1; y < array.length - 1; y++) {
            for (int x = 1; x < array[y].length - 1; x++) {

                //F-
                final int northWest     = array[y-1][x-1];
                final int north         = array[y-1][x+0];
                final int northEast     = array[y-1][x+1];
             // final int west          = array[y+0][x-1];
                final int center        = array[y+0][x+0];
             // final int east          = array[y+0][x+1];
                final int southWest     = array[y+1][x-1];
                final int south         = array[y+1][x+0];
                final int southEast     = array[y+1][x+1];

                final int hourGlassSum = northWest + north  + northEast            +
                                                0  + center + 0                    +
                                         southWest + south  + southEast            ;
                //F+

                if (hourGlassSum > maxHourGlassSum) {
                    maxHourGlassSum = hourGlassSum;
                }
            }
        }

        return maxHourGlassSum;
    }

    public static void main(final String[] args) {
        //F-
        final String input = new String(
                                        "1 1 1 0 0 0\n" + 
                                        "0 1 0 0 0 0\n" + 
                                        "1 1 1 0 0 0\n" + 
                                        "0 0 0 0 0 0\n" + 
                                        "0 0 0 0 0 0\n" + 
                                        "0 0 0 0 0 0"
                             );
        //F+

        System.out.println("Highest Hourglass Sum - " + hourglassSum(stringToProblemMatrix(input)));
    }

    public static int[][] stringToProblemMatrix(final String input) {

        final String[] rows = input.split("\n");

        final int rowCount = rows.length;
        final int colCount = rows[0].split(" ").length;

        final int[][] matrix = new int[rowCount][colCount];

        for (int i = 0; i < rows.length; i++) {

            final String[] cols = rows[i].split(" ");

            for (int j = 0; j < cols.length; j++) {
                matrix[i][j] = Integer.parseInt(cols[j]);
            }
        }

        return matrix;
    }
}
