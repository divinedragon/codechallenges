package techgig;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BehindEnemyLinesTest {

    @Before
    public void setUp() {
        BehindEnemyLines fixture = new BehindEnemyLines();

        assertThat(fixture, is(notNullValue()));
    }

    @Test
    public void testcase1() {

        int wordLength = 4;
        int searchStringLength = 11;

        String word = "cAda";
        String searchString = "AbrAcadAbRa";

        int expectedCount = 2;

        int actualCount = BehindEnemyLines.appearanceCount(wordLength, searchStringLength, word, searchString);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

    @Test
    public void testcase2() {

        int wordLength = 6;
        int searchStringLength = 102;

        String word = "MexIco";
        String searchString = "MexIcobMexIcobFILbMexIcobMexIcobjMexIcobvMexIcobMexIcobMexIcobgMexIcobdMexIcobZVMexIcobMexIcobaMexIcob";

        int expectedCount = 13;

        int actualCount = BehindEnemyLines.appearanceCount(wordLength, searchStringLength, word, searchString);

        assertThat(actualCount, is(equalTo(expectedCount)));
    }

}
