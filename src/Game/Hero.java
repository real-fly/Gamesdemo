package Game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;

public abstract class Hero extends GameObject {
    // 角色矩形的尺寸
    public int width = 45;
    public int height = 45;
    // 角色移动速度
    private int speed = 3;
    // 角色方向
    private Direction direction = Direction.DOWN;
    // 四向图片
    private String upImg;
    private String downImg;
    private String leftImg;
    private String rightImg;

    // 构造函数
    public Hero(String img, int x, int y, GameFrame gameFrame, String upImg, String downImg, String leftImg,
            String rightImg) {
        super(img, x, y, gameFrame);
        this.upImg = upImg;
        this.downImg = downImg;
        this.leftImg = leftImg;
        this.rightImg = rightImg;
    }

    public void upward() {
        this.y -= speed;
        setImg(upImg);
        direction = Direction.UP;
    }

    public void downward() {
        this.y += speed;
        setImg(downImg);
        direction = Direction.DOWN;
    }

    public void leftward() {
        this.x -= speed;
        setImg(leftImg);
        direction = Direction.LEFT;
    }

    public void rightward() {
        this.x += speed;
        setImg(rightImg);
        direction = Direction.RIGHT;
    }

    public void setImg(String img) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
    }

    @Override
    public abstract void paintSelf(Graphics g);

    @Override
    public abstract Rectangle getRec();
}
