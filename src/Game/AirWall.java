package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class AirWall extends GameObject {
    // 尺寸
    int length = 100;

    // 构造器
    public AirWall(String img, int x, int y, GameFrame gameFrame) {
        super(img, x, y, gameFrame);
    }

    @Override
    public void paintSelf(Graphics g) {
        // TODO Auto-generated method stub
        g.drawImage(img, x, y, gameFrame);

    }

    @Override
    public Rectangle getRec() {
        // TODO Auto-generated method stub
        return new Rectangle(x, y, length, length);
    }
}