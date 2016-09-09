package gameoflife;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RuleEngineTest {

    private RuleEngine fixture;

    @Before
    public void beforeTest() {
        fixture = new RuleEngine();
    }

    @Test
    public void isAliveInNextGenerationRule1() {
        assertThat(fixture.isAliveInNextGeneration(true, -1), is(false));
        assertThat(fixture.isAliveInNextGeneration(true, 0), is(false));
        assertThat(fixture.isAliveInNextGeneration(true, 1), is(false));
    }

    @Test
    public void isAliveInNextGenerationRule2() {
        assertThat(fixture.isAliveInNextGeneration(true, 2), is(true));
        assertThat(fixture.isAliveInNextGeneration(true, 3), is(true));
    }

    @Test
    public void isAliveInNextGenerationRule3() {
        assertThat(fixture.isAliveInNextGeneration(true, 4), is(false));
        assertThat(fixture.isAliveInNextGeneration(true, 5), is(false));
    }

    @Test
    public void isAliveInNextGenerationRule4() {
        assertThat(fixture.isAliveInNextGeneration(false, 2), is(false));
        assertThat(fixture.isAliveInNextGeneration(false, 3), is(true));
        assertThat(fixture.isAliveInNextGeneration(false, 4), is(false));
    }
}
