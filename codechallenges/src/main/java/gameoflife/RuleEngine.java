package com.divinedragon.codechallenges.gameoflife;

public class RuleEngine {

    public boolean isAliveInNextGeneration(
            final boolean isAliveInCurrentGeneration,
            final int aliveNeighbours) {

        boolean isAlive = false;


        /* Check if the Current Cell is Alive or Dead.
         * Rule 1, 2 and 3 are applicable when the current cell is alive
         */
        if (isAliveInCurrentGeneration) {

            /* Current Cell is Alive. Check if needs to be Alive in next generation also */
            if (aliveNeighbours < 2) {
                isAlive = false;
            } else if (aliveNeighbours <= 3) {
                isAlive = true;
            } else if (aliveNeighbours > 3) {
                isAlive = false;
            }
        } else {

            /* Current Cell is NOT Alive. Check if it can come to life. */
            if (aliveNeighbours == 3) {
                isAlive = true;
            } else {
                isAlive = false;
            }
        }

        return isAlive;
    }   
}
