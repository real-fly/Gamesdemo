package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class NPC1 extends Hero {
    //剧情对话型NPC
    public NPC1(String img, int x, int y, GameFrame gameFrame) {
        super(img, y, y, gameFrame, img, img, img, img);
    }

    @Override
    public void paintSelf(Graphics g) {
        g.drawImage(img, x, y, null);
    }

    @Override
    public Rectangle getRec() {
        return new Rectangle(x, y, width, height);
    }
    
}