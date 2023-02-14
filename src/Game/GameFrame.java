package Game;

import java.awt.Graphics;
import java.awt.*;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

    Player player = new Player("src\\Image\\playerdown.png", 100, 200, this, "src\\Image\\playerup.png",
            "src\\Image\\playerdown.png", "src\\Image\\playerleft.png", "src\\Image\\playerright.png");

    UpdateThread ut;

    public GameFrame() {
        setSize(1600, 900); // 设置窗口大小
        setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口模式
        setResizable(false); // 窗口固定

        JPanel gamePan = new JPanel();
        gamePan.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(gamePan);
        gamePan.setLayout(null);

        JPanel panel = new MyPanel();
        panel.setBounds(0, 0, 1600, 900);
        gamePan.add(panel);
        panel.setLayout(null);

        setVisible(true);

        ut = new UpdateThread(panel);
        ut.start();
    }

    class MyPanel extends JPanel {
        public void paint(Graphics g) {
            // super.paint(g);
            ImageIcon map1 = new ImageIcon("src\\Image\\map1.png");

            g.drawImage(map1.getImage(), 0, 0, null);

            player.paintSelf(g);
        }
    }
}

class UpdateThread extends Thread {
    JPanel panel;

    public UpdateThread(JPanel panel) {
        this.panel = panel;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            panel.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}