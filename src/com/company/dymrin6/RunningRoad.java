package com.company.dymrin6;

public class RunningRoad implements Obstacle {
    @Override
    public void overcome(Participant participant) {
        participant.run();
    }
}
