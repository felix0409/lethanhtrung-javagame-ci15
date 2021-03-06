package game;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class Player extends GameObject {
    int fireCount;
    int bulletType;
    int changeBulletCount;
    Random random;
    BufferedImage skillSpecial;

    public Player() {
//        image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        position.set(200, 500);
        fireCount = 0;
        skillSpecial=SpriteUtils.loadImage("assets/images/sphere-bullets/0.png");
        bulletType=1;
        changeBulletCount=0;
    }

    @Override
    public void run() {
        super.run();
        playerMove();
        playerLimit();
        playerFire();
        changeBulletType();
    }



    private void playerMove() {
        int vX=0;
        int vY=0;
        if (GameWindow.isUpPress)
            vY--;
        if (GameWindow.isDownPress)
            vY++;
        if (GameWindow.isLeftPress)
            vX--;
        if (GameWindow.isRightPress)
            vX++;
        this.velocity.set(vX,vY);
        this.velocity.setLength(1);
    }
    private void playerFire() {
        fireCount++;
        if (GameWindow.isFirePress && fireCount>20)
        {
            PlayerBullet bullet=new PlayerBullet();
            bullet.loadImageByType(bulletType);
            bullet.position.set(this.position.x,this.position.y);
            bullet.velocity.setAngle(-Math.PI*0.5);

            fireCount=0;
        }
    }


    private void changeBulletType() {
        changeBulletCount++;
        if (changeBulletCount>300){
            random=new Random();
            bulletType=1+random.nextInt(3);
            changeBulletCount=0;
        }
    }

    private void playerLimit() {
        if (position.y>Settings.GAME_HEIGHT-Settings.PLAYER_HEIGHT)
            position.y=Settings.GAME_HEIGHT-Settings.PLAYER_HEIGHT;
        if (position.y<0)
            position.y=0;
        if (position.x>Settings.BACKGROUND_WIDTH-Settings.PLAYER_WIDTH)
            position.x=Settings.BACKGROUND_WIDTH-Settings.PLAYER_WIDTH;
        if (position.x<0)
            position.x=0;
    }
}

