package Game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Player extends Hero {
    public Player(String img, int x, int y, GameFrame gameFrame, String upImg, String downImg, String leftImg,
            String rightImg) {
        super(img, x, y, gameFrame, upImg, downImg, leftImg, rightImg);
    }

    static boolean up = false;
    static boolean down = false;
    static boolean left = false;
    static boolean right = false;
    int upcnt = 350, downcnt = 470, leftcnt = 250, rightcnt = 1300;

    public void move() {
        if (left) {
            if (leftcnt > 0) {
                leftcnt -= 3;
                rightcnt += 3;
                leftward();
            } else {
                Player.left = false;
            }
        } else if (right) {
            if (rightcnt > 0) {
                rightcnt -= 3;
                leftcnt += 3;
                rightward();
            } else {
                Player.right = false;
            }
        } else if (up) {
            if (upcnt > 0) {
                upcnt -= 3;
                downcnt += 3;
                upward();
            } else {
                Player.up = false;
            }
        } else if (down) {
            if (downcnt > 0) {
                downcnt -= 3;
                upcnt += 3;
                downward();
            } else {
                Player.down = false;
            }
        }
    }

    @Override
    public void paintSelf(Graphics g) {
        g.drawImage(img, x, y, null);
        move();
    }

    @Override
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
}
