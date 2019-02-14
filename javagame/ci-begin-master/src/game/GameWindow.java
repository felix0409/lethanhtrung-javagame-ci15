package game;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
    public static boolean isUpPress;
    public static boolean isDownPress;
    public static boolean isLeftPress;
    public static boolean isRightPress;

    public GameWindow() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //Su kien giu phim
                System.out.println(e.getKeyCode()); //getKeyChar(): lay chinh xac phim dang bam
                //getKeyCode(): moi phim co mot code rieng :)
                if(e.getKeyCode() == KeyEvent.VK_A) {
                    isLeftPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_D) {
                    isRightPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    isUpPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    isDownPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println(e.getKeyCode());
                //su kien nha phim
                if(e.getKeyCode() == KeyEvent.VK_A) {
                    isLeftPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_D) {
                    isRightPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_W) {
                    isUpPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S) {
                    isDownPress = false;
                }
            }
        });

    }
}
