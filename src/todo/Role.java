package todo;
public abstract class Role {
    private String name; // 角色名
    private double hp; // 血量
    private double maxHp; // 总血量
    private double lastHp; // 当前血量
    private double mp; // 法力
    private double maxMp;
    private double lastMp;
    private int atk; // 攻击力
    private int def; // 防御力
    private String bodypath;
    private String sName1; // 技能1-普攻
    private String sName2; // 技能2-技能
    private String sName3; // 技能3-增幅类
    private String sName4; // 技能4-逃跑

    public abstract void attack(int skill, Role role);

    public abstract void skill1(Role role); 

    public abstract void skill2(Role role); 

    public abstract void skill3();

    public abstract void skill4();


    public Role(String name, double hp, double maxHp, double mp, double maxMp, int atk, int def,
            String bodypath, String sName1, String sName2, String sName3,String sName4) {
        super();
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.mp = mp;
        this.maxMp = maxMp;
        this.atk = atk;
        this.def = def;
        this.bodypath = bodypath;
        this.sName1 = sName1;
        this.sName2 = sName2;
        this.sName3 = sName3;
        this.sName4 = sName4;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(double maxHp) {
        this.maxHp = maxHp;
    }

    public double getLastMp() {
        return lastMp;
    }

    public void setLastMp(double lastMp) {
        this.lastMp = lastMp;
    }

    public double getLastHp() {
        return lastHp;
    }

    public void setLastHp(double lastHp) {
        this.lastHp = lastHp;
    }

    public double getMp() {
        return mp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public double getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(double maxMp) {
        this.maxMp = maxMp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getBodypath() {
        return bodypath;
    }

    public void setBodypath(String bodypath) {
        this.bodypath = bodypath;
    }

    public String getsName1() {
        return sName1;
    }

    public void setsName1(String sName1) {
        this.sName1 = sName1;
    }

    public String getsName2() {
        return sName2;
    }

    public void setsName2(String sName2) {
        this.sName2 = sName2;
    }

    public String getsName3() {
        return sName3;
    }

    public void setsName3(String sName3) {
        this.sName3 = sName3;
    }

    public String getsName4() {
        return sName4;
    }

    public void setsName4(String sName4) {
        this.sName4 = sName4;
    }
}