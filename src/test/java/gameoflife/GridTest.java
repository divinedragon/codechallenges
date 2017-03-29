package gameoflife;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class GridTest {

    private Grid fixture;

    private int fixtureRows;

    private int fixtureCols;

    private RuleEngine ruleEngine;

    @Before
    public void beforeTest() {

        RuleEngine ruleEngine = mock(RuleEngine.class);
        fixtureRows = 3;
        fixtureCols = 3;

        fixture = new Grid(fixtureRows, fixtureCols, ruleEngine);

        /*
         * We will test for following grid - x - - x - - x - (0,0) -> 2 (0,1) ->
         * 1 (0,2) -> 2 (1,0) -> 3 (1,1) -> 2 (1,2) -> 3 (2,0) -> 2 (2,1) -> 1
         * (2,2) -> 2
         */

        fixture.setState(0, 0, false);
        fixture.setState(0, 1, true);
        fixture.setState(0, 2, false);
        fixture.setState(1, 0, false);
        fixture.setState(1, 1, true);
        fixture.setState(1, 2, false);
        fixture.setState(2, 0, false);
        fixture.setState(2, 1, true);
        fixture.setState(2, 2, false);

        when(ruleEngine.isAliveInNextGeneration(anyBoolean(), anyInt())).thenAnswer(new Answer<Boolean>() {

            public Boolean answer(final InvocationOnMock invocation) throws Throwable {
                Object[] args = invocation.getArguments();

                boolean isAliveInCurrentGeneration = (Boolean) args[0];
                int aliveNeighbours = (Integer) args[1];

                boolean isAlive = false;

                /*
                 * Check if the Current Cell is Alive or Dead. Rule 1, 2 and 3
                 * are applicable when the current cell is alive
                 */
                if (isAliveInCurrentGeneration) {

                    /*
                     * Current Cell is Alive. Check if needs to be Alive in next
                     * generation also
                     */
                    if (aliveNeighbours < 2) {
                        isAlive = false;
                    } else if (aliveNeighbours <= 3) {
                        isAlive = true;
                    } else if (aliveNeighbours > 3) {
                        isAlive = false;
                    }
                } else {

                    /*
                     * Current Cell is NOT Alive. Check if it can come to life.
                     */
                    if (aliveNeighbours == 3) {
                        isAlive = true;
                    } else {
                        isAlive = false;
                    }
                }

                return isAlive;
            }

        });
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGridInvalidRows() {
        new Grid(-1, fixtureCols, ruleEngine);
        fail("Invalid Grid Rows accepted");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGridInvalidCols() {
        new Grid(fixtureRows, -1, ruleEngine);
        fail("Invalid Grid Cols accepted");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGridNullRuleEngine() {
        new Grid(fixtureRows, fixtureCols, null);
        fail("Null RuleEngine accepted");
    }

    @Test
    public void testGrid() {
        assertEquals(fixtureRows, fixture.getRows());
        assertEquals(fixtureCols, fixture.getCols());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateInvalidRowIndexLowerLimit() {
        fixture.setState(-1, 0, true);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateInvalidRowIndexHigherLimit() {
        fixture.setState(3, 0, true);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateInvalidColIndexLowerLimit() {
        fixture.setState(0, -1, true);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetStateInvalidColIndexHigherLimit() {
        fixture.setState(0, 3, true);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test
    public void testSetStateGetState() {
        fixture.setState(0, 0, true);
        assertThat("Valid setState not saved", fixture.getState(0, 0), is(equalTo(true)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStateInvalidRowIndexLowerLimit() {
        fixture.getState(-1, 0);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStateInvalidRowIndexHigherLimit() {
        fixture.getState(3, 0);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStateInvalidColIndexLowerLimit() {
        fixture.getState(0, -1);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetStateInvalidColIndexHigherLimit() {
        fixture.getState(0, 3);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAliveNeighbourCountInvalidRowIndexLowerLimit() {
        fixture.getAliveNeighbourCount(-1, 0);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAliveNeighbourCountInvalidRowIndexHigherLimit() {
        fixture.getAliveNeighbourCount(3, 0);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAliveNeighbourCountInvalidColIndexLowerLimit() {
        fixture.getAliveNeighbourCount(0, -1);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetAliveNeighbourCountInvalidColIndexHigherLimit() {
        fixture.getAliveNeighbourCount(0, 3);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test
    public void testGetAliveNeighbourCount() {

        assertThat("Alive Neighbour Count is incorrect. (0,0)", fixture.getAliveNeighbourCount(0, 0), is(equalTo(2)));
        assertThat("Alive Neighbour Count is incorrect. (0,1)", fixture.getAliveNeighbourCount(0, 1), is(equalTo(1)));
        assertThat("Alive Neighbour Count is incorrect. (0,2)", fixture.getAliveNeighbourCount(0, 2), is(equalTo(2)));

        assertThat("Alive Neighbour Count is incorrect. (1,0)", fixture.getAliveNeighbourCount(1, 0), is(equalTo(3)));
        assertThat("Alive Neighbour Count is incorrect. (1,1)", fixture.getAliveNeighbourCount(1, 1), is(equalTo(2)));
        assertThat("Alive Neighbour Count is incorrect. (1,2)", fixture.getAliveNeighbourCount(1, 2), is(equalTo(3)));

        assertThat("Alive Neighbour Count is incorrect. (2,0)", fixture.getAliveNeighbourCount(2, 0), is(equalTo(2)));
        assertThat("Alive Neighbour Count is incorrect. (2,1)", fixture.getAliveNeighbourCount(2, 1), is(equalTo(1)));
        assertThat("Alive Neighbour Count is incorrect. (2,2)", fixture.getAliveNeighbourCount(2, 2), is(equalTo(2)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNextGenerationStateInvalidRowIndexLowerLimit() {
        fixture.getNextGenerationState(-1, 0);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNextGenerationStateInvalidRowIndexHigherLimit() {
        fixture.getNextGenerationState(3, 0);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNextGenerationStateInvalidColIndexLowerLimit() {
        fixture.getNextGenerationState(0, -1);
        fail("Invalid Row Index (Lower) is processed");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNextGenerationStateInvalidColIndexHigherLimit() {
        fixture.getNextGenerationState(0, 3);
        fail("Invalid Row Index (Higher) is processed");
    }

    @Test
    public void testGetNextGenerationStateRule1() {

        assertThat("Next Generation State is incorrect. (0,0)", fixture.getNextGenerationState(0, 0),
                is(equalTo(false)));
        assertThat("Next Generation State is incorrect. (0,1)", fixture.getNextGenerationState(0, 1),
                is(equalTo(false)));
        assertThat("Next Generation State is incorrect. (0,2)", fixture.getNextGenerationState(0, 2),
                is(equalTo(false)));

        assertThat("Next Generation State is incorrect. (1,0)", fixture.getNextGenerationState(1, 0),
                is(equalTo(true)));
        assertThat("Next Generation State is incorrect. (1,1)", fixture.getNextGenerationState(1, 1),
                is(equalTo(true)));
        assertThat("Next Generation State is incorrect. (1,2)", fixture.getNextGenerationState(1, 2),
                is(equalTo(true)));

        assertThat("Next Generation State is incorrect. (2,0)", fixture.getNextGenerationState(2, 0),
                is(equalTo(false)));
        assertThat("Next Generation State is incorrect. (2,1)", fixture.getNextGenerationState(2, 1),
                is(equalTo(false)));
        assertThat("Next Generation State is incorrect. (2,2)", fixture.getNextGenerationState(2, 2),
                is(equalTo(false)));
    }

    @Test
    public void testNextGenerationExample1() {

        /*
         * Scenario - Input x x x x Scenario - Output x x x x
         */

        Grid example = new Grid(2, 2, fixture.getRuleEngine());

        example.setState(0, 0, true);
        example.setState(0, 1, true);
        example.setState(1, 0, true);
        example.setState(1, 1, true);

        Grid exampleNextGeneration = example.nextGeneration();

        assertThat("Invalid Next Generation State - (0,0)", exampleNextGeneration.getState(0, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (0,1)", exampleNextGeneration.getState(0, 1), is(equalTo(true)));

        assertThat("Invalid Next Generation State - (1,0)", exampleNextGeneration.getState(1, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,1)", exampleNextGeneration.getState(1, 1), is(equalTo(true)));
    }

    @Test
    public void testNextGenerationExample2() {

        /*
         * Scenario - Input x x - x - x - x - Scenario - Output x x - x - x - x
         * -
         */

        Grid example = new Grid(3, 3, fixture.getRuleEngine());

        example.setState(0, 0, true);
        example.setState(0, 1, true);
        example.setState(0, 2, false);
        example.setState(1, 0, true);
        example.setState(1, 1, false);
        example.setState(1, 2, true);
        example.setState(2, 0, false);
        example.setState(2, 1, true);
        example.setState(2, 2, false);

        Grid exampleNextGeneration = example.nextGeneration();

        assertThat("Invalid Next Generation State - (0,0)", exampleNextGeneration.getState(0, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (0,1)", exampleNextGeneration.getState(0, 1), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (0,2)", exampleNextGeneration.getState(0, 2), is(equalTo(false)));

        assertThat("Invalid Next Generation State - (1,0)", exampleNextGeneration.getState(1, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,1)", exampleNextGeneration.getState(1, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (1,2)", exampleNextGeneration.getState(1, 2), is(equalTo(true)));

        assertThat("Invalid Next Generation State - (2,0)", exampleNextGeneration.getState(2, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (2,1)", exampleNextGeneration.getState(2, 1), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (2,2)", exampleNextGeneration.getState(2, 2), is(equalTo(false)));
    }

    @Test
    public void testNextGenerationExample3() {

        /*
         * Scenario - Input - x - - x - - x - Scenario - Output - - - x x x - -
         * -
         */

        Grid example = new Grid(3, 3, fixture.getRuleEngine());

        example.setState(0, 0, false);
        example.setState(0, 1, true);
        example.setState(0, 2, false);
        example.setState(1, 0, false);
        example.setState(1, 1, true);
        example.setState(1, 2, false);
        example.setState(2, 0, false);
        example.setState(2, 1, true);
        example.setState(2, 2, false);

        Grid exampleNextGeneration = example.nextGeneration();

        assertThat("Invalid Next Generation State - (0,0)", exampleNextGeneration.getState(0, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,1)", exampleNextGeneration.getState(0, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,2)", exampleNextGeneration.getState(0, 2), is(equalTo(false)));

        assertThat("Invalid Next Generation State - (1,0)", exampleNextGeneration.getState(1, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,1)", exampleNextGeneration.getState(1, 1), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,2)", exampleNextGeneration.getState(1, 2), is(equalTo(true)));

        assertThat("Invalid Next Generation State - (2,0)", exampleNextGeneration.getState(2, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (2,1)", exampleNextGeneration.getState(2, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (2,2)", exampleNextGeneration.getState(2, 2), is(equalTo(false)));
    }

    @Test
    public void testNextGenerationExample4() {

        /*
         * Scenario - Input - - - - - x x x x x x - - - - - Scenario - Output -
         * - x - x - - x x - - x - x - -
         */

        Grid example = new Grid(4, 4, fixture.getRuleEngine());

        example.setState(0, 0, false);
        example.setState(0, 1, false);
        example.setState(0, 2, false);
        example.setState(0, 3, false);
        example.setState(1, 0, false);
        example.setState(1, 1, true);
        example.setState(1, 2, true);
        example.setState(1, 3, true);
        example.setState(2, 0, true);
        example.setState(2, 1, true);
        example.setState(2, 2, true);
        example.setState(2, 3, false);
        example.setState(3, 0, false);
        example.setState(3, 1, false);
        example.setState(3, 2, false);
        example.setState(3, 3, false);

        Grid exampleNextGeneration = example.nextGeneration();

        assertThat("Invalid Next Generation State - (0,0)", exampleNextGeneration.getState(0, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,1)", exampleNextGeneration.getState(0, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,2)", exampleNextGeneration.getState(0, 2), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (0,3)", exampleNextGeneration.getState(0, 3), is(equalTo(false)));

        assertThat("Invalid Next Generation State - (1,0)", exampleNextGeneration.getState(1, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,1)", exampleNextGeneration.getState(1, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (1,2)", exampleNextGeneration.getState(1, 2), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (1,3)", exampleNextGeneration.getState(1, 3), is(equalTo(true)));

        assertThat("Invalid Next Generation State - (2,0)", exampleNextGeneration.getState(2, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (2,1)", exampleNextGeneration.getState(2, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (2,2)", exampleNextGeneration.getState(2, 2), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (2,3)", exampleNextGeneration.getState(2, 3), is(equalTo(true)));

        assertThat("Invalid Next Generation State - (3,0)", exampleNextGeneration.getState(3, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (3,1)", exampleNextGeneration.getState(3, 1), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (3,2)", exampleNextGeneration.getState(3, 2), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (3,3)", exampleNextGeneration.getState(3, 3), is(equalTo(false)));
    }

    @Test
    public void testNextGenerationExample5() {

        /*
         * Scenario - Input - - x - x - - x x - - x - x - - Scenario - Output -
         * - - - - x x x x x x - - - - -
         */

        Grid example = new Grid(4, 4, fixture.getRuleEngine());

        example.setState(0, 0, false);
        example.setState(0, 1, false);
        example.setState(0, 2, true);
        example.setState(0, 3, false);
        example.setState(1, 0, true);
        example.setState(1, 1, false);
        example.setState(1, 2, false);
        example.setState(1, 3, true);
        example.setState(2, 0, true);
        example.setState(2, 1, false);
        example.setState(2, 2, false);
        example.setState(2, 3, true);
        example.setState(3, 0, false);
        example.setState(3, 1, true);
        example.setState(3, 2, false);
        example.setState(3, 3, false);

        Grid exampleNextGeneration = example.nextGeneration();

        assertThat("Invalid Next Generation State - (0,0)", exampleNextGeneration.getState(0, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,1)", exampleNextGeneration.getState(0, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,2)", exampleNextGeneration.getState(0, 2), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (0,3)", exampleNextGeneration.getState(0, 3), is(equalTo(false)));

        assertThat("Invalid Next Generation State - (1,0)", exampleNextGeneration.getState(1, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (1,1)", exampleNextGeneration.getState(1, 1), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,2)", exampleNextGeneration.getState(1, 2), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (1,3)", exampleNextGeneration.getState(1, 3), is(equalTo(true)));

        assertThat("Invalid Next Generation State - (2,0)", exampleNextGeneration.getState(2, 0), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (2,1)", exampleNextGeneration.getState(2, 1), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (2,2)", exampleNextGeneration.getState(2, 2), is(equalTo(true)));
        assertThat("Invalid Next Generation State - (2,3)", exampleNextGeneration.getState(2, 3), is(equalTo(false)));

        assertThat("Invalid Next Generation State - (3,0)", exampleNextGeneration.getState(3, 0), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (3,1)", exampleNextGeneration.getState(3, 1), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (3,2)", exampleNextGeneration.getState(3, 2), is(equalTo(false)));
        assertThat("Invalid Next Generation State - (3,3)", exampleNextGeneration.getState(3, 3), is(equalTo(false)));
    }
}
