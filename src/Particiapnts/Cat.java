package Particiapnts;

import Obstacles.Obstacle;
import Obstacles.RunningTrack;
import Obstacles.Wall;

public class Cat implements Participant {
    public static final float MAX_METERS_JUMP_LIM = 2F;
    public static final float MAX_METERS_RUN_LIM = 300F;

    public Cat(Wall wall, RunningTrack runningTrack) {
        jump(wall);
        run(runningTrack);
    }

    @Override
    public void jump(Wall wall) {
        boolean passed = wall.overcome(MAX_METERS_JUMP_LIM);
        if(passed){
            System.out.println("Кіт перестрибнув стіну на висоті " + wall.getWallLength() +" метрів");
        }else{
            System.out.println("Кіт не перестрибнув стіну на дистанції " + wall.getWallLength() + " метрів. Стрибнув на " + MAX_METERS_JUMP_LIM + "метрів");
        }
    }

    @Override
    public void run(RunningTrack runningTrack) {
        boolean passed = runningTrack.overcome(MAX_METERS_RUN_LIM);
        if(passed){
            System.out.println("Кіт пройшов бігову доріжку на дистанції " + runningTrack.getRunLength() + " метрів");
        }else{
            System.out.println("Кіт не пройшов бігову доріжку на дистанції " + runningTrack.getRunLength() + " метрів. Пройдено " + MAX_METERS_RUN_LIM + " метрів");
        }
    }
}
