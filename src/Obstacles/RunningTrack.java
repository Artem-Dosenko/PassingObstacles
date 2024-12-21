package Obstacles;

import Particiapnts.Participant;

import java.util.Random;

public class RunningTrack implements Obstacle{
    private float runLength;

    public float getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public RunningTrack(float runLength) {
        this.runLength = runLength;
    }

    @Override
    public boolean overcome(float meters) {
        return meters >= runLength;
    }
}
