package projecteuler.problem0001;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import projecteuler.problem0001.Problem0003_LargestPrimeFactor;

@Parameters
public class Problem0003_LargestPrimeFactorTest {

    @DataProvider(name = "testcases")
    public Object[][] testCases() {
        return new Object[][] {
            { new Long(13195), new Integer(29) },
            { new Long(600851475143L), new Integer(6857) }
        };
    }

    @Test(dataProvider = "testcases")
    public void testGetLargestPrimeFactor(final Long number, final Integer expectedResult) {
        assertTrue(expectedResult == Problem0003_LargestPrimeFactor.getLargestPrimeFactor(number),
                "Calculation not correct");
    }
}