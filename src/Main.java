import Obstacles.Obstacle;
import Obstacles.RunningTrack;
import Obstacles.Wall;
import Particiapnts.Cat;
import Particiapnts.Human;
import Particiapnts.Participant;
import Particiapnts.Robot;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {new Wall(2), new RunningTrack(800)};
        Participant[] participants = {new Human((Wall) obstacles[0], (RunningTrack) obstacles[1]), new Cat((Wall) obstacles[0],(RunningTrack) obstacles[1]), new Robot((Wall) obstacles[0], (RunningTrack) obstacles[1])};
    }
}
