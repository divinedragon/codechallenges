package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P002_MonkeyTroubleTest {

    private P002_MonkeyTrouble fixture;

    @Before
    public void setUp() {
        fixture = new P002_MonkeyTrouble();
    }

    @Test
    public void shouldBeInTroubleIfBothAreSmiling() {
        boolean shouldBeInTrouble = true;

        boolean monkeyASmiling = true;
        boolean monkeyBSmiling = true;

        boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble, is(equalTo(areWeInTrouble)));
    }

    @Test
    public void shouldBeInTroubleIfBothAreNotSmiling() {
        boolean shouldBeInTrouble = true;

        boolean monkeyASmiling = false;
        boolean monkeyBSmiling = false;

        boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble, is(equalTo(areWeInTrouble)));
    }

    @Test
    public void shouldNotBeInTroubleIfASmilingAndBNotSmiling() {
        boolean shouldBeInTrouble = false;

        boolean monkeyASmiling = true;
        boolean monkeyBSmiling = false;

        boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble, is(equalTo(areWeInTrouble)));
    }

    @Test
    public void shouldNotBeInTroubleIfANotSmilingAndASmiling() {
        boolean shouldBeInTrouble = false;

        boolean monkeyASmiling = false;
        boolean monkeyBSmiling = true;

        boolean areWeInTrouble = fixture.monkeyTrouble(monkeyASmiling, monkeyBSmiling);

        assertThat(shouldBeInTrouble, is(equalTo(areWeInTrouble)));
    }
}
