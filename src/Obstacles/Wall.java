package Obstacles;

import Particiapnts.Participant;

import java.util.Random;

public class Wall implements Obstacle{
    private float wallLength;

    public float getWallLength() {
        return wallLength;
    }

    public void setWallLength(float wallLength) {
        this.wallLength = wallLength;
    }

    public Wall(float wallLength) {
        this.wallLength = wallLength;
    }

    @Override
    public boolean overcome(float meters) {
        return meters >= wallLength;
    }
}
