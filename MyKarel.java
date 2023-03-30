package com.shpp.rshmelev.cs;

import com.shpp.karel.KarelTheRobot;

public class MyKarel extends KarelTheRobot {

    //In this task, Karel is looking for his newspaper (beeper).
    //The code is commented and decomposed.
    //In the method of wounds, there are only 3 methods, as indicated.

    public void run() throws Exception {
        // Let's go to the beeper
        findBeeper();

        // Raise the beeper and turn around to go back
        raiseTheBeeper();

        // Go to the starting point
        goToTheStartingPoint();
    }

    //This function makes Karel go forward until he hits an obstacle.
    public void goForwardUntilTheFrontIsClear() throws Exception {
        while (frontIsClear()) {
            move();
        }
    }

    //This function makes Karel go straight as long as there is an obstacle to his left
    public void goForwardUntilTheLeftIsBlocked() throws Exception {
        while (leftIsBlocked()) {
            move();
        }
    }

    //This function makes the Karel make a right turn.
    public void turnRight() throws Exception {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    //The function makes Karel turn 180 degrees
    public void rotate180Degrees() throws Exception {
        turnLeft();
        turnLeft();
    }

    //The function makes Karel walk until he finds a beeper
    public void moveUntilFindABeeper() throws Exception {
        while (noBeepersPresent()) {
            move();
        }
    }

    public void findBeeper() throws Exception {
        // We go along the wall until we come across an obstacle.
        goForwardUntilTheFrontIsClear();
        // We turn right
        turnRight();
        // We go straight until the turn to the left is blocked
        goForwardUntilTheLeftIsBlocked();
        // We turn left
        turnLeft();
        // We go straight until we find a beeper
        moveUntilFindABeeper();
    }

    public void raiseTheBeeper() throws Exception {
        // We found a beeper, we pick it up
        pickBeeper();
        // Turning to 180%
        rotate180Degrees();
    }

    public void goToTheStartingPoint() throws Exception {
        // We go straight until we find an obstacle
        goForwardUntilTheFrontIsClear();
        // We turn right
        turnRight();
        // We go straight until we find an obstacle
        goForwardUntilTheFrontIsClear();
        // We are here, mission accomplished.
    }
}
