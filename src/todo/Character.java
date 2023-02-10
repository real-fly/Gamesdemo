package todo;

import Game.Role;

public class Character extends Role{
    public Character() {
        super("战士", 100, 100, 100, 100, 10, 0, "Image/战士001.png", "普攻", "重击", "狂暴","逃跑");
    }
    
    public void attack(int skill, Role role) {
        role.setLastHp(role.getHp());
        if (skill == 1) {
            skill1(role);
        } else if (skill == 2) {
            skill2(role);
        } else if (skill == 3){
            skill3();
        } else {
            skill4();
        }

    }

    public void skill1(Role role) {
        // TODO 自动生成的方法存根
        StartFrame.showMessage("我方使用" + this.getsName1());
        role.setLastHp(role.getHp());
        role.setHp(role.getHp() - (this.getAtk() - role.getDef()));

    }

    public void skill2() {
        // TODO 自动生成的方法存根
        this.setLastMp(this.getMp());
        this.setMp(this.getMp() - (0.3 - 0.01 * this.getLv()) * this.getMaxMp());
        if (this.getMp() <= 0) {
            this.setMp(this.getLastMp());
            StartFrame.flag = false;
            StartFrame.showMessage("蓝量不足!");
            return;
        } else {
            StartFrame.showMessage("我方使用" + this.getsName2());
            a.play(6);
            this.setLastHp(this.getHp());
            this.setHp(this.getHp() + (this.getMaxHp() - this.getHp()) * 0.3);
        }

    }

    public void skill3(Role role) {
        // TODO 自动生成的方法存根
        this.setLastMp(this.getMp());
        this.setMp(this.getMp() - (0.7 - 0.03 * this.getLv()) * this.getMaxMp());
        if (this.getMp() <= 0) {
            this.setMp(this.getLastMp());
            StartFrame.flag = false;
            StartFrame.showMessage("蓝量不足!");
            return;
        } else {
            StartFrame.showMessage("我方使用" + this.getsName3());
            a.play(5);
            role.setLastHp(role.getHp());
            role.setHp(role.getHp() - this.getAtk() * 2 + role.getDef());
        }

    }

    public void equipment(int i) {
        if (i == 0) {
            this.setAtk(this.getAtk() + 10);
        } else if (i == 1) {
            this.setDef(this.getDef() + 10);
        }
    }

    public void removeEqu(int i) {
        if (i == 0) {
            this.setAtk(this.getAtk() - 10);
        } else if (i == 1) {
            this.setDef(this.getDef() - 10);
        }
    }

    public void levelup() {
        if ((this.getExp() >= this.getLv() * (this.getLv() + 1)) && (this.getLv() < 10)) {
            this.setLv(this.getLv() + 1);
            this.setMaxHp(this.getMaxHp() + 0.1 * this.getMaxHp());
            this.setHp(this.getMaxHp());
            this.setMaxMp(this.getMaxMp() + 0.05 * this.getMaxMp());
            this.setMp(this.getMaxMp());
            this.setAtk(this.getAtk() + 4);
            this.setDef(this.getDef() + 2);
        } else {
            this.setHp(this.getMaxHp());
            this.setMp(this.getMaxMp());
        }
    }

}
