package game;

import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    BufferedImage backgroundImage;
    BufferedImage playerImage;
    int backgroundX;
    int backgroundY;
    int playerX;
    int playerY;
    int x;
    int y;


    public GamePanel() {
        // load anh
        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        backgroundX = 0;
        backgroundY = -3109+600;
        playerX = 200;
        playerY = 500;
    }

    @Override
    public void paint(Graphics g) {
        //ve anh
        g.drawImage(backgroundImage, backgroundX, backgroundY,null);
        g.drawImage(playerImage, playerX, playerY,null);
    }

    public void gameLoop(){
        long lastTime = 0;
        long delay = 1000 / 60;
        while(true) {
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= delay) {
                // ve anh + chay logic
                runAll(); //ham chay tat ca logic trong game
                renderAll();//ham ve tat ca anh trong game
                lastTime = currentTime;
            }
        }
    }

    private void renderAll() {
        repaint(); //goi ham paint, thay vi paint();
    }

//    private void runAll() {
//        backgroundY++;
//        if (GameWindow.isUpPress) {
//            playerY--;
//        }
//        if (GameWindow.isDownPress) {
//            playerY++;
//        }
//        if (GameWindow.isRightPress) {
//            playerX++;
//        }
//        if (GameWindow.isLeftPress) {
//            playerX--;
//        }
//    }
    private void runAll() {
        if (backgroundY < 0) {
            backgroundY += 1;
        }
        if (GameWindow.isUpPress) {
            if (playerY > 0) {
                playerY--;
            }
        }
        if (GameWindow.isLeftPress) {
            if (playerX > 0) {
                playerX--;
            }
        }
        if (GameWindow.isDownPress) {
            if (playerY < 600 - 48 * 2) {
                playerY++;
            }
        }
        if (GameWindow.isRightPress) {
            if (playerX < 384 - 32) {
                playerX++;
            }
        }
    }
}
