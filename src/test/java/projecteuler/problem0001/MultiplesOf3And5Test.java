package projecteuler.problem0001;

import static org.testng.Assert.assertTrue;

    import org.testng.annotations.DataProvider;
    import org.testng.annotations.Test;

import projecteuler.problem0001.MultiplesOf3And5;
    
    public class MultiplesOf3And5Test {
    
        @DataProvider(name = "testcases")
        public Object[][] testCases() {
            return new Object[][] {
                { new int[] {3, 5}, new Integer(10), new Integer(23) },
                { new int[] {3, 5}, new Integer(1000), new Integer(233168) }
            };
        }
    
        @Test(dataProvider = "testcases")
        public void testGetSumOfMultiples3And5(
                final int[] multipliers,
                final Integer numberList,
                final Integer expectedResult) {
            assertTrue(expectedResult == MultiplesOf3And5.getSumOfMultiples(multipliers, numberList),
                    "Incorrect Sum of Multiples of 3 and 5 Below 10");
        }
    }
