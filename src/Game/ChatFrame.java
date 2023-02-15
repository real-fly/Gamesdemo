// package Game;

// import javax.swing.JFrame;
// import javax.swing.JOptionPane;
// import javax.swing.JPanel;
// import javax.swing.border.EmptyBorder;

// public class ChatFrame extends JFrame {
//     GameObject obj_1;
//     GameObject obj_2;
//     private JPanel contentPane;

//     public ChatFrame(GameObject obj_1, GameObject obj_2) {
//         this.obj_1 = obj_1;
//         this.obj_2 = obj_2;
//         //顶层容器
//         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//         setSize(160, 90);
//         setLocationRelativeTo(null);
//         //中间容器
//         contentPane = new JPanel()；
//         contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//         this.setContentPane(contentPane);
//         contentPane.setLayout(null);
//         contentPane.setLayout(null);

//         //显示的容器
//         JPanel panel = new JPanel();
//         panel.setBounds(0, 0, 555, 306);
//         contentPane.add(panel);
//         panel.setLayout(null);
//         initBar();
//         panel.add(progressBar);
//         panel.add(progressBar_1);
//         panel.add(blueBar);
//         panel.add(blueBar_1);
//     }
    
//     public static void showMessage(String str) {
//         JOptionPane.showMessageDialog(null, str);
//     }
// }