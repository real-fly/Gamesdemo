package Game;

import java.awt.Graphics;
import java.awt.*;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame {
    // 双缓冲机制-定义双缓存图片
    Image offScreenImage = null;

    int width = 1600;
    int height = 900;

    Player player = new Player("src\\Image\\playerdown.png", 100, 200, this, "src\\Image\\playerup.png",
            "src\\Image\\playerdown.png", "src\\Image\\playerleft.png", "src\\Image\\playerright.png");

    public GameFrame() {
        setSize(1600, 900); // 设置窗口大小
        setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);// 关闭窗口模式
        setResizable(false); // 窗口固定

        JPanel gamePan = new JPanel();

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        // 双缓存-创建和容器大小相同的Image图片
        if (offScreenImage == null) {
            offScreenImage = this.createImage(width, height);
        }
        // 获取图片画笔
        Graphics gImage = offScreenImage.getGraphics();

        // 内容
        Image bg = Toolkit.getDefaultToolkit().getImage("src\\Image\\map1.png");
        repaint();
        player.paintSelf(gImage);
        g.drawImage(bg, 0, 0, this);
        // 将缓存区绘制好的图形整个绘制到容器的画布中
        g.drawImage(offScreenImage, 0, 0, null);

    }
}
