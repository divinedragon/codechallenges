package codingbat.logic1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P15_AnswerCellTest {

    private P15_AnswerCell fixture;

    @Before
    public void setUp() {
        fixture = new P15_AnswerCell();
    }

    @Test
    public void answerCellShouldReturnFalseWhenSleeping() {

        final boolean isAsleep = true;
        final boolean isMorning = false;
        final boolean isMom = false;

        final boolean expected = false;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual, is(expected));
    }

    @Test
    public void answerCellShouldReturnFalseWhenAwakeAndIsMorningAndNotMom() {

        final boolean isAsleep = false;
        final boolean isMorning = true;
        final boolean isMom = false;

        final boolean expected = false;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual, is(expected));
    }

    @Test
    public void answerCellShouldReturnTrueWhenAwakeAndIsMorningAndIsMom() {

        final boolean isAsleep = false;
        final boolean isMorning = true;
        final boolean isMom = true;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual, is(expected));
    }

    @Test
    public void answerCellShouldReturnTrueWhenAwakeAndNotMorningAndIsMom() {

        final boolean isAsleep = false;
        final boolean isMorning = false;
        final boolean isMom = true;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual, is(expected));
    }

    @Test
    public void answerCellShouldReturnTrueWhenAwakeAndNotMorningAndNotMom() {

        final boolean isAsleep = false;
        final boolean isMorning = false;
        final boolean isMom = false;

        final boolean expected = true;

        final boolean actual = fixture.answerCell(isMorning, isMom, isAsleep);

        assertThat(actual, is(expected));
    }
}
