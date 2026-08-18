package com.abstract_test;

public abstract class Ghost {
    private String name;
    private int HP;//生命值
    private int ATK;//攻击力
    private int DP;//防御力


    public Ghost() {
    }

    public Ghost(String name, int HP, int ATK, int DP) {
        this.name = name;
        this.HP = HP;
        this.ATK = ATK;
        this.DP = DP;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * 设置
     * @param HP
     */
    public void setHP(int HP) {
        this.HP = HP;
    }

    /**
     * 获取
     * @return ATK
     */
    public int getATK() {
        return ATK;
    }

    /**
     * 设置
     * @param ATK
     */
    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    /**
     * 获取
     * @return DP
     */
    public int getDP() {
        return DP;
    }

    /**
     * 设置
     * @param DP
     */
    public void setDP(int DP) {
        this.DP = DP;
    }

    public abstract void attack();
}
