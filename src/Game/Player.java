package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends Hero{
    public Player(String img, int x, int y, GameFrame gameFrame, String upImg, String downImg, String leftImg, String rightImg) {
        super(img, x, y, gameFrame,upImg,downImg,leftImg,rightImg );
    }

    @Override
    public void paintSelf(Graphics g){
        g.drawImage(img, x, y, null);
    }

    @Override
    public Rectangle getRec(){
        return new Rectangle(x, y, width, height);
    }
}
