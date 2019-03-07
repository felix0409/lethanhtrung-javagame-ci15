package game;

import game.renderer.SingleImageRenderer;
import tklibs.SpriteUtils;

import java.awt.image.BufferedImage;

public class EnemyBullet extends GameObject {

    public EnemyBullet() {
//        image = SpriteUtils.loadImage("assets/images/enemies/bullets/red.png");
        renderer = new SingleImageRenderer(SpriteUtils.loadImage("assets/images/enemies/bullets/red.png")); // đạn ccuarenemy k cần đổi ảnh đâu, khi nào có cái gì đặc biệt thì mới đổi nên mình dùng SingleImageRenderer
        this.velocity.set(3, 3);
        velocity.setLength(3);
    }
}
