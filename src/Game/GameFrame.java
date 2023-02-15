package Game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
  
public class GameFrame extends JFrame {

    Player player = new Player("src\\Image\\playerdown.png", 250, 350, this, "src\\Image\\playerup.png",
            "src\\Image\\playerdown.png", "src\\Image\\playerleft.png", "src\\Image\\playerright.png");

    //批量游戏物体
    ArrayList<NPC1> npc1list = new ArrayList<NPC1>();
    ArrayList<AirWall> walllist = new ArrayList<AirWall>();

    UpdateThread ut;

    public GameFrame() {
        this.setSize(1600, 900); // 设置窗口大小
        this.setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 关闭窗口模式
        this.setResizable(false); // 窗口固定

        JPanel gamePan = new JPanel(); //中间容器
        gamePan.setBorder(new EmptyBorder(5, 5, 5, 5));
        this.setContentPane(gamePan);
        gamePan.setLayout(null);

        JPanel panel = new MyPanel();
        panel.setBounds(0, 0, 1600, 900);
        gamePan.add(panel);
        panel.setLayout(null);

        this.setVisible(true);

        //多线程
        ut = new UpdateThread(panel);
        ut.start();

        //角色移动的按键响应
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_A:
                        Player.left = true;
                        break;
                    case KeyEvent.VK_S:
                        Player.down = true;
                        break;
                    case KeyEvent.VK_D:
                        Player.right = true;
                        break;
                    case KeyEvent.VK_W:
                        Player.up = true;
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                int key = e.getKeyCode();
                switch (key) {
                    case KeyEvent.VK_A:
                        Player.left = false;
                        break;
                    case KeyEvent.VK_S:
                        Player.down = false;
                        break;
                    case KeyEvent.VK_D:
                        Player.right = false;
                        break;
                    case KeyEvent.VK_W:
                        Player.up = false;
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub

            }
        });

        //添加npc
        NPC1 npc_1 = new NPC1("src\\Image\\npc01.png", 500, 500, this);
        npc1list.add(npc_1);

        //添加围墙
        for (int i = 0; i <= 14; i++) {
            walllist.add(new AirWall("src\\Image\\wall.png", 100 * i, 150, this));
            walllist.add(new AirWall("src\\Image\\wall.png", 100 * i, 750, this));
        }
    }
    
    class MyPanel extends JPanel {
        public void paint(Graphics g) {
            // super.paint(g);
            ImageIcon map1 = new ImageIcon("src\\Image\\map1.png");

            g.drawImage(map1.getImage(), 0, 0, null);

            player.paintSelf(g);

            //npc

            for (NPC1 npc1 : npc1list) {
                npc1.paintSelf(g);
            }
            for (AirWall wall : walllist) {
                wall.paintSelf(g);
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
}