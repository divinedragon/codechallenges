package com.divinedragon.codechallenges.gameoflife;

import org.springframework.util.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.divinedragon.codechallenges.gameoflife.RuleEngine;

public class RuleEngineTest {

    private RuleEngine fixture;

    @BeforeTest
    public void beforeTest() {
        fixture = new RuleEngine();
    }

    @Test
    public void isAliveInNextGenerationRule1() {
        Assert.isTrue(fixture.isAliveInNextGeneration(true, -1) == false);
        Assert.isTrue(fixture.isAliveInNextGeneration(true, 0) == false);
        Assert.isTrue(fixture.isAliveInNextGeneration(true, 1) == false);
    }

    @Test
    public void isAliveInNextGenerationRule2() {
        Assert.isTrue(fixture.isAliveInNextGeneration(true, 2) == true);
        Assert.isTrue(fixture.isAliveInNextGeneration(true, 3) == true);
    }

    @Test
    public void isAliveInNextGenerationRule3() {
        Assert.isTrue(fixture.isAliveInNextGeneration(true, 4) == false);
        Assert.isTrue(fixture.isAliveInNextGeneration(true, 5) == false);
    }

    @Test
    public void isAliveInNextGenerationRule4() {
        Assert.isTrue(fixture.isAliveInNextGeneration(false, 2) == false);
        Assert.isTrue(fixture.isAliveInNextGeneration(false, 3) == true);
        Assert.isTrue(fixture.isAliveInNextGeneration(false, 4) == false);
    }
}
