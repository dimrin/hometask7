package com.company.dymrin6;

public class JumpingWall implements Obstacle {
    @Override
    public void overcome(Participant participant) {
        participant.jump();
    }
}
