package codingbat.warmup1;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class P005_ParrotTroubleTest {

    private P005_ParrotTrouble fixture;

    @Before
    public void setup() {
        fixture = new P005_ParrotTrouble();
    }

    @Test
    public void shouldBeTroubleWhenParrotTalkingBefore7() {
        boolean shouldBeInTrouble = true;

        boolean isParrotTalking = true;
        int hour = 6;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }

    @Test
    public void shouldBeTroubleWhenParrotTalkingAfter20() {
        boolean shouldBeInTrouble = true;

        boolean isParrotTalking = true;
        int hour = 21;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }

    @Test
    public void shouldNotBeTroubleWhenParrotTalkingAt7() {
        boolean shouldBeInTrouble = false;

        boolean isParrotTalking = true;
        int hour = 7;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }

    @Test
    public void shouldNotBeTroubleWhenParrotTalkingAfter7Before20() {
        boolean shouldBeInTrouble = false;

        boolean isParrotTalking = true;
        int hour = 8;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }

    @Test
    public void shouldNotBeTroubleWhenParrotTalkingAt20() {
        boolean shouldBeInTrouble = false;

        boolean isParrotTalking = true;
        int hour = 19;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }

    @Test
    public void shouldNotBeTroubleWhenParrotNotTalkingAfter20() {
        boolean shouldBeInTrouble = false;

        boolean isParrotTalking = false;
        int hour = 21;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }

    @Test
    public void shouldNotBeTroubleWhenParrotNotTalkingBefore7() {
        boolean shouldBeInTrouble = false;

        boolean isParrotTalking = false;
        int hour = 6;

        boolean areWeInTrouble = fixture.parrotTrouble(isParrotTalking, hour);

        assertThat(areWeInTrouble, is(equalTo(shouldBeInTrouble)));
    }
}
