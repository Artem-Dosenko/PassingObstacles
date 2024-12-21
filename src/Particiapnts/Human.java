package Particiapnts;

import Obstacles.RunningTrack;
import Obstacles.Wall;

public class Human implements Participant{
    public static final float MAX_METERS_JUMP_LIM = 0.5F;
    public static final float MAX_METERS_RUN_LIM = 800F;

    public Human(Wall wall, RunningTrack runningTrack) {
        jump(wall);
        run(runningTrack);
    }

    @Override
    public void jump(Wall wall) {
        boolean passed = wall.overcome(MAX_METERS_JUMP_LIM);
        if(passed){
            System.out.println("Людина перестрибнула стіну на висоті " + wall.getWallLength() +" метрів");
        }else{
            System.out.println("Людина не перестрибнула стіну на дистанції " + wall.getWallLength() + " метрів. Стрибнула на " + MAX_METERS_JUMP_LIM + " метрів");
        }
    }

    @Override
    public void run(RunningTrack runningTrack) {
        boolean passed = runningTrack.overcome(MAX_METERS_RUN_LIM);
        if(passed){
            System.out.println("Людина пройшла бігову доріжку на дистанції " + runningTrack.getRunLength() + " метрів");
        }else{
            System.out.println("Людина не пройшла бігову доріжку на дистанції " + runningTrack.getRunLength() + " метрів. Пройдено " + MAX_METERS_RUN_LIM + " метрів");
        }
    }
}
