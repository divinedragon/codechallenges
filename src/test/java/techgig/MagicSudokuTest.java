package techgig;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MagicSudokuTest {

    private MagicSudoku fixture;

    @Before
    public void setUp() {
        fixture = new MagicSudoku();
    }

    @Test
    public void testcase1() {
        //@formatter:off
        int[][] matrix = {
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 0, 0 }
                         };
        //@formatter:on

        int expected = 1;

        int actual = fixture.solveMagicSquare(matrix);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase2() {
        //@formatter:off
        int[][] matrix = {
                            { 1, 2, 3, 4 },
                            { 3, 4, 1, 2 },
                            { 2, 1, 4, 3 },
                            { 4, 3, 2, 1 }
                         };
        //@formatter:on

        int expected = 1;

        int actual = fixture.solveMagicSquare(matrix);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void testcase3() {
        //@formatter:off
        int[][] matrix = {
                            { 1, 2, 3, 0,  0,  0,  0,  0,  0 },
                            { 0, 0, 0, 0,  0,  0,  1,  2,  3 },
                            { 0, 0, 0, 1,  2,  3,  0,  0,  0 },
                            { 2, 3, 1, 0,  0,  0,  0,  0,  0 },
                            { 0, 0, 0, 0,  0,  0,  2,  3,  1 },
                            { 0, 0, 0, 2,  3,  1,  0,  0,  0 },
                            { 3, 1, 2, 0,  0,  0,  0,  0,  0 },
                            { 0, 0, 0, 0,  0,  0,  3,  1,  2 },
                            { 0, 0, 0, 3,  1,  2,  0,  0,  0 }
                         };
        //@formatter:on

        int expected = 1;

        int actual = fixture.solveMagicSquare(matrix);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void invalidMatrixLower() {
        //@formatter:off
        int[][] matrix = {
                            { -1, 2, 3, 4 },
                            {  3, 4, 1, 2 },
                            {  2, 1, 4, 3 },
                            {  4, 3, 2, 1 }
                         };
        //@formatter:on

        int expected = 0;

        int actual = fixture.solveMagicSquare(matrix);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void invalidMatrixLowerUpper() {
        //@formatter:off
        int[][] matrix = {
                            { 10, 2, 3, 4 },
                            {  3, 4, 1, 2 },
                            {  2, 1, 4, 3 },
                            {  4, 3, 2, 1 }
                         };
        //@formatter:on

        int expected = 0;

        int actual = fixture.solveMagicSquare(matrix);

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void invalidMatrixLowerMultiValues() {
        //@formatter:off
        int[][] matrix = {
                            { 1, 1, 1, 1 },
                            { 3, 4, 1, 2 },
                            { 2, 1, 4, 3 },
                            { 4, 3, 2, 1 }
                         };
        //@formatter:on

        int expected = 0;

        int actual = fixture.solveMagicSquare(matrix);

        assertThat(actual, is(equalTo(expected)));
    }
}
