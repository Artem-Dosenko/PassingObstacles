package Particiapnts;

import Obstacles.RunningTrack;
import Obstacles.Wall;

public interface Participant {
    public void jump(Wall wall);
    public void run(RunningTrack runningTrack);
}
