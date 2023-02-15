package Game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;

public abstract class Hero extends GameObject {
    // 角色矩形的尺寸
    public static int width = 45;
    public static int height = 45;
    // 角色移动速度
    static int speed = 3;
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
        if (!hitWall(x, y - speed)) {
            this.y -= speed;
        }
        setImg(upImg);
        direction = Direction.UP;
    }

    public void downward() {
        if (!hitWall(x, y + speed)) {
            this.y += speed;
        }
        setImg(downImg);
        direction = Direction.DOWN;
    }

    public void leftward() {
        if (!hitWall(x - speed, y)) {
            this.x -= speed;
        }
        setImg(leftImg);
        direction = Direction.LEFT;
    }

    public void rightward() {
        if (!hitWall(x + speed, y)) {
            this.x += speed;
        }
        setImg(rightImg);
        direction = Direction.RIGHT;
    }

    public void setImg(String img) {
        this.img = Toolkit.getDefaultToolkit().getImage(img);
    }

    // 碰撞检测
    public boolean hitWall(int x, int y) {
        ArrayList<AirWall> walls = this.gameFrame.walllist;
        ArrayList<NPC1> npc1_s = this.gameFrame.npc1list;
        // 玩家下一步位置形成的矩形
        Rectangle next = new Rectangle(x, y, width, height);
        for (AirWall wall : walls) {
            if (next.intersects(wall.getRec())) {
                return true;
            }
        }
        for (NPC1 npc : npc1_s) {
            if (next.intersects(npc.getRec())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public abstract void paintSelf(Graphics g);

    @Override
    public abstract Rectangle getRec();
}
