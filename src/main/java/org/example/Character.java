package org.example;

public class Character {
    public String name;
    public int hp; //血量
    public int mp;  //魔力
    public int attack; //攻击
    public int defense; //防御
    public int speed; //速度
    public int luck; //幸运
    public int exp; //经验
    public int level; //等级
    public int gold; //金币
    public int maxHp; //最大血量
    public int maxMp; //最大魔力
    public int maxExp; //最大经验
    public int maxLevel; //最大等级
    public int maxGold; //最大金币

    public Character(String name) { //构造函数
        this.name = name; //名字
    }
    public void sethp(int hp) { //设置血量
        this.hp = hp; //血量
    }
    public void setmp(int mp) { //设置魔力 下面都一个原理
        this.mp = mp;
    }
    public void setattack(int attack) {
        this.attack = attack;
    }
    public void setdefense(int defense) {
        this.defense = defense;
    }
    public void setspeed(int speed) {
        this.speed = speed;
    }
    public void setluck(int luck) {
        this.luck = luck;
    }
    public void setexp(int exp) {
        this.exp = exp;
    }
    public void setlevel(int level) {
        this.level = level;
    }
    public void setgold(int gold) {
        this.gold = gold;
    }
    public void setmaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public void setmaxMp(int maxMp) {
        this.maxMp = maxMp;
    }
    public void setmaxExp(int maxExp) {
        this.maxExp = maxExp;
    }
    public void setmaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }
    public void setmaxGold(int maxGold) {
        this.maxGold = maxGold;
    }
    public void printCharacter() {
        System.out.println(this);
    }
}
