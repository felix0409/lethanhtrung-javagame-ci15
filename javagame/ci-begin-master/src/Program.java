import game.GamePanel;
import game.GameWindow;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args){
        GameWindow window = new GameWindow();
        window.setSize(800,600);
        window.setResizable(false); //khong cho window thay doi kich thuoc
        window.setTitle("Game Touhou");

        GamePanel panel = new GamePanel();
        window.add(panel);
        window.setVisible(true);
        panel.gameLoop();

        // bien
        // ham
        // if/else switch/case


        // try/catch
        // su dung try/catch khi loi~ nao co the loi~
//        try {
//            divide(10, 0);
//        } catch(Exception exception) {
//            exception.printStackTrace(); // in ra noi phat sinh loi~.
//        }
//
//        System.out.println("Hello");
    }
}

//btvn tim hieu class Anh?, cach ve anh? vao` panel