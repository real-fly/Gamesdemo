package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Message{
    public Message(Hero hero){
        JTextField jt1=new JTextField();//new一个文本框
        JTextArea jt2=new JTextArea(); //new一个文本区
        JScrollPane jsp=new JScrollPane(jt2); //new一个滚条
        String title = "Hello";
        JFrame jf=new JFrame(title);
        Container container=jf.getContentPane();
        //container.setBackground(Color.yellow); //容器的背景色
        jf.setVisible(true); //窗体可见
        jf.setSize(600, 400);//窗体大小
        jf.setLayout(new BorderLayout()); //边界布局
        jf.add(BorderLayout.NORTH,jt1);//文本框边界顶部放置
        jt1.setBackground(Color.yellow);
        jf.add(BorderLayout.CENTER,jt2);//文本框边界中间放置
        jt2.setBackground(Color.blue);
        jt1.addActionListener(new ActionListener() { // 监听器
            public void actionPerformed(ActionEvent e) {
                jt2.setText(jt1.getText());
            }
        });
    }
}

