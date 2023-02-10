package Game;

import javax.swing.ImageIcon;

public class Map {
    static ImageIcon icon0 = new ImageIcon("src\\Image\\草地.png");
    static ImageIcon icon1 = new ImageIcon("src\\Image\\喷火龙行走.png");
    static ImageIcon icon2 = new ImageIcon("src\\Image\\水箭龟行走.png");
    static ImageIcon icon3 = new ImageIcon("src\\Image\\妙蛙花行走.png");
    static ImageIcon icon4 = new ImageIcon("src\\Image\\皮卡丘行走.png");
    static ImageIcon icon5 = new ImageIcon("src\\Image\\皮卡丘行走1.png");
    static ImageIcon icon6 = new ImageIcon("src\\Image\\皮卡丘行走2.png");
    static ImageIcon icon7 = new ImageIcon("src\\Image\\皮卡丘行走3.png");
    static ImageIcon icon8 = new ImageIcon("src\\Image\\皮卡丘行走4.png");
    static ImageIcon icon9 = new ImageIcon("src\\Image\\皮卡丘行走5.png");
    static ImageIcon icon10 = new ImageIcon("src\\Image\\皮卡丘行走6.png");
    static ImageIcon icon11 = new ImageIcon("src\\Image\\皮卡丘行走7.png");
    static ImageIcon icon12 = new ImageIcon("src\\Image\\皮卡丘行走8.png");
    static ImageIcon icon13 = new ImageIcon("src\\Image\\皮卡丘行走9.png");
    static ImageIcon icon14 = new ImageIcon("src\\Image\\皮卡丘行走10.png");
    static ImageIcon icon15 = new ImageIcon("src\\Image\\皮卡丘行走11.png");
    static ImageIcon icon16 = new ImageIcon("src\\Image\\草路.png");
    static ImageIcon icon17 = new ImageIcon("src\\Image\\水转角.png");
    static ImageIcon icon18 = new ImageIcon("src\\Image\\水边.png");
    static ImageIcon icon19 = new ImageIcon("src\\Image\\水边1.png");
    static ImageIcon icon20 = new ImageIcon("src\\Image\\水中.png");
    static ImageIcon icon21 = new ImageIcon("src\\Image\\树.png");
    static ImageIcon icon22 = new ImageIcon("src\\Image\\火转角.png");
    static ImageIcon icon23 = new ImageIcon("src\\Image\\火边.png");
    static ImageIcon icon24 = new ImageIcon("src\\Image\\火边1.png");
    static ImageIcon icon25 = new ImageIcon("src\\Image\\火中.png");

    static ImageIcon draw(int n) {
        if (n == 0) {
            return icon0;
        } else if (n == 1) {
            return icon1;
        } else if (n == 2) {
            return icon2;
        } else if (n == 3) {
            return icon3;
        } else if (n == 4) {
            return icon4;
        } else if (n == 5) {
            return icon5;
        } else if (n == 6) {
            return icon6;
        } else if (n == 7) {
            return icon7;
        } else if (n == 8) {
            return icon8;
        } else if (n == 9) {
            return icon9;
        } else if (n == 10) {
            return icon10;
        } else if (n == 11) {
            return icon11;
        } else if (n == 12) {
            return icon12;
        } else if (n == 13) {
            return icon13;
        } else if (n == 14) {
            return icon14;
        } else if (n == 15) {
            return icon15;
        } else if (n == 16) {
            return icon16;
        } else if (n == 17) {
            return icon17;
        } else if (n == 18) {
            return icon18;
        } else if (n == 19) {
            return icon19;
        } else if (n == 20) {
            return icon20;
        } else if (n == 21) {
            return icon21;
        } else if (n == 22) {
            return icon22;
        } else if (n == 23) {
            return icon23;
        } else if (n == 24) {
            return icon24;
        } else if (n == 25) {
            return icon25;
        }
        return null;
    }

}
