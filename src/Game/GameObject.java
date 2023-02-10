package Game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


public abstract class GameObject {
    //图片
    public Image img;

    //坐标
    public int x;
    public int y;
    
    //界面
    public GameFrame gameFrame;

    public GameObject(String img, int x, int y, GameFrame gameFrame) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
        this.x = x;
        this.y = y;
        this.gameFrame = gameFrame;
    }

    public abstract void paintSelf(Graphics g);

    public abstract Rectangle getRec();

}