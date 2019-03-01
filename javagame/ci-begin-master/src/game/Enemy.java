package game;

import tklibs.SpriteUtils;

public class Enemy extends GameObject {

    public Enemy() {
        image = SpriteUtils.loadImage("assets/images/enemies/level0/pink/0.png");
        position.set(-50, -50);
        velocity.set(2, 2);
        velocity.setAngle(Math.PI / 18);
        velocity.setLength(Settings.ENEMY_SPEED);
    }

    @Override
    public void run() {
        super.run();
        changeVelocity();
    }

    private void changeVelocity() {
        if(position.x > Settings.BACKGROUND_WIDTH - Settings.ENEMY_WIDTH
                && velocity.x > 0) {
            velocity.set(-velocity.x, velocity.y);
        }
        if(position.x < 0 && velocity.x < 0) {
            velocity.set(-velocity.x, velocity.y);
        }
        if(position.y > Settings.GAME_HEIGHT - Settings.ENEMY_HEIGHT
                && velocity.y > 0) {
            velocity.set(velocity.x, -velocity.y);
        }
        if(position.y < 0 && velocity.y < 0) {
            velocity.set(velocity.x, -velocity.y);
        }
    }
}
