package Game;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Start extends JFrame {
    // private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // 创建并显示窗口
                    Start frame = new Start();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // 构造器，创建窗体
    public Start() {
        // 创建一个顶层容器（窗口）
        super("Game");
        setSize(1600, 900); // 设置窗口大小
        setLocationRelativeTo(null); // 把窗口位置设置到屏幕中心
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//关闭窗口模式
        setResizable(false); // 窗口固定

        // 添加播放背景音乐
        BGM a = new BGM();
        a.play();

        // 绘制开始界面
        paint();

        // // 按钮响应事件
        // btn.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent arg0) {
        //         // a.stop();
        //         // BGM w = new BGM();
        //         // w.play();
        //         Character hero = new Character();
        //         try {
        //             new MoveFrame(hero);
        //         } catch (InterruptedException e) {
        //             // TODO 自动生成的 catch 块
        //             e.printStackTrace();
        //         }
        //         dispose();
        //     }
        // });
        // pan.setLayout(null);
        // btn.setBorderPainted(false);
        // btn.setContentAreaFilled(false);
        // btn.setFocusPainted(false);
    }


    private void paint() {
        // 把图片添加到标签里（把标签的大小设为和图片大小相同），把标签放在分层面板的最底层；
        ImageIcon bg = new ImageIcon("src\\Image\\bg.jpg");
        JLabel label = new JLabel(bg);
        label.setSize(bg.getIconWidth(), bg.getIconHeight());
        getLayeredPane().add(label, Integer.valueOf(Integer.MIN_VALUE));
        // 把窗口面板设为内容面板并设为透明、流动布局。
        JPanel pan = (JPanel) getContentPane();
        pan.setOpaque(false);
        pan.setLayout(null);
        // 之后把按钮组件和面板添加到窗口面板；
        JButton btn = new JButton();
        btn.setIcon(new ImageIcon("src\\Image\\开始游戏按钮.png"));
        btn.setBounds(619, 404, 362, 92);
        pan.add(btn);
        setSize(bg.getIconWidth(), bg.getIconHeight());
        //响应按键
        buttonListener(btn);

    }

    private void buttonListener(JButton btn) {
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                //游戏进程
                System.out.print("hello");
                new GameFrame();
            }
        });
    }
    
    
    
}
