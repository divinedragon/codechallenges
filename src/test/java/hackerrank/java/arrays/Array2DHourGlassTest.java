package hackerrank.java.arrays;

import static hackerrank.java.arrays.Array2DHourGlass.hourglassSum;
import static hackerrank.java.arrays.Array2DHourGlass.stringToProblemMatrix;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Array2DHourGlassTest {

    @Test
    public void shouldProcessArrayCorrectly() {

        //F-
        final String input = new String(
                                        "1 1 1 0 0 0\n" + 
                                        "0 1 0 0 0 0\n" + 
                                        "1 1 1 0 0 0\n" + 
                                        "0 0 2 4 4 0\n" + 
                                        "0 0 0 2 0 0\n" + 
                                        "0 0 1 2 4 0"
                             );
        //F+

        final int expected = 19;
        final int actual = hourglassSum(stringToProblemMatrix(input));

        assertThat(actual, is(equalTo(expected)));
    }
}
